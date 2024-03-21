package com.mandacarubroker.controller;

import com.mandacarubroker.domain.users.Users;
import com.mandacarubroker.domain.userswallet.GetAllDataTransferObject;
import com.mandacarubroker.domain.userswallet.GetResponseDataTransferObject;
import com.mandacarubroker.repository.UsersRepository;
import com.mandacarubroker.service.UsersWalletService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SuppressWarnings("checkstyle:MissingJavadocType")
@RestController
@RequestMapping("wallet")
public class UsersWalletController {
  private final UsersWalletService service;
  private final UsersRepository usersRepository;

  public UsersWalletController(
    UsersWalletService usersWalletService,
    UsersRepository usersRepository
  ) {
    this.service = usersWalletService;
    this.usersRepository = usersRepository;
  }

  @Operation(summary = "Get all assets in the wallet", method = "GET")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "success"),
  })
  @GetMapping("/{userId}")
  public ResponseEntity<GetResponseDataTransferObject> getAll(@PathVariable String userId) {
    Users findUser = this.usersRepository.findUsersById(userId);

    if (findUser == null) {
      return ResponseEntity
          .badRequest()
          .body(new GetResponseDataTransferObject(
              false,
              "User not found",
              null
          ));
    }

    List<GetAllDataTransferObject> response = service.getAll(userId);
    if (response.isEmpty()) {
      return ResponseEntity
          .ok()
          .body(new GetResponseDataTransferObject(
              false,
              "not found any register",
              null
          ));
    }

    return ResponseEntity
        .ok()
        .body(new GetResponseDataTransferObject(
            true,
            null,
            response
        ));
  }
}
