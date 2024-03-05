package com.mandacarubroker.controller;

import com.mandacarubroker.domain.users.LoginDataTransferObject;
import com.mandacarubroker.domain.users.LoginResponseDataTransferObject;
import com.mandacarubroker.domain.users.RegisterDataTransferObject;
import com.mandacarubroker.domain.users.Users;
import com.mandacarubroker.infra.security.TokenService;
import com.mandacarubroker.repository.UsersRepository;
import com.mandacarubroker.service.UsersService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UsersController {
  private final UsersRepository usersRepository;
  private final UsersService usersService;

  @SuppressWarnings("checkstyle:MissingJavadocType")
  public UsersController(
      UsersRepository usersRepository,
      UsersService usersService,
      AuthenticationManager authenticationManager,
      TokenService tokenService
  ) {
    this.usersRepository = usersRepository;
    this.usersService = usersService;
  }
  @Operation(summary = "Login a user", method = "POST")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "success"),
  })
  @SuppressWarnings("checkstyle:MissingJavadocType")
  @PostMapping("/login")
  public ResponseEntity<LoginResponseDataTransferObject> login(
      @RequestBody @Valid LoginDataTransferObject data
  ) {
    Users user = this.usersService.get(data);

    if (user == null) {
      return ResponseEntity
          .badRequest()
          .body(new LoginResponseDataTransferObject(
              false,
              "Unregistered user.",
              null
          ));
    }

    return ResponseEntity.ok(new LoginResponseDataTransferObject(true, null, user));
  }
  @SuppressWarnings("checkstyle:MissingJavadocType")
  @ExceptionHandler(BadCredentialsException.class)
  public ResponseEntity<LoginResponseDataTransferObject> handleBadCredentialsException(
      BadCredentialsException ex
  ) {
    return ResponseEntity
        .status(HttpStatus.UNAUTHORIZED)
        .body(new LoginResponseDataTransferObject(false, ex.getMessage(), null));
  }
  @Operation(summary = "Register a user", method = "POST")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "success"),
  })
  @PostMapping("/register")
  public ResponseEntity<ResponseStatus> register(
      @RequestBody @Valid RegisterDataTransferObject data
  ) {
    if (this.usersRepository.findUsersByUsername(data.username()) != null) {
      return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }

    usersService.create(data);

    return ResponseEntity.ok().build();
  }
  @Operation(summary = "Update user data", method = "POST")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "success"),
  })
  @PutMapping("/{id}")
  public Users update(@PathVariable String id, @RequestBody @Valid Users data) {
    return usersService.update(id, data).orElse(null);
  }
  @Operation(summary = "Delete a user", method = "POST")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "success"),
  })
  @DeleteMapping("/{id}")
  public void delete(@PathVariable String id) {
    usersService.delete(id);
  }
}
