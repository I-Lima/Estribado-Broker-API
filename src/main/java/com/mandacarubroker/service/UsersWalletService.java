package com.mandacarubroker.service;

import com.mandacarubroker.domain.userswallet.GetAllDataTransferObject;
import com.mandacarubroker.domain.userswallet.RegisterDataTransferObject;
import com.mandacarubroker.domain.userswallet.UsersWallet;
import com.mandacarubroker.repository.UsersWalletRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UsersWalletService {
  private final UsersWalletRepository repository;

  public UsersWalletService(
    UsersWalletRepository usersWalletRepository
  ) {
    this.repository = usersWalletRepository;
  }

  public List<GetAllDataTransferObject> getAll(String userId) {
    return repository.getAllByUserId(userId);
  }

  public UsersWallet create(RegisterDataTransferObject data) {
    UsersWallet newRegister = new UsersWallet(data);

    return repository.save(newRegister);
  }

  public Optional<UsersWallet> update(String id, RegisterDataTransferObject data) {
    return repository.findById(id)
      .map(item -> {
        item.setUserId(data.userId());
        item.setTypeInvestmentId(data.typeInvestmentId());
        item.setSymbol(data.symbol());
        item.setAmount(data.amount());
        item.setPrice(data.price());

        return repository.save(item);
      });
  }

  public void delete(String id) {
    repository.deleteById(id);
  }
}
