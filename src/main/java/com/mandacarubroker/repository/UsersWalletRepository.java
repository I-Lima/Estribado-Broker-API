package com.mandacarubroker.repository;

import com.mandacarubroker.domain.userswallet.GetAllDataTransferObject;
import com.mandacarubroker.domain.userswallet.UsersWallet;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersWalletRepository extends JpaRepository<UsersWallet, String> {
  @Query("SELECT new com.mandacarubroker.domain.userswallet.GetAllDataTransferObject(uw.id, ti.name, uw.userId, uw.symbol, uw.amount, uw.price) " +
    "FROM types_investments ti " +
    "JOIN users_wallet uw " +
    "ON ti.id = uw.typeInvestmentId")
  List<GetAllDataTransferObject> getAllByUserId(String userId);

  @Query("SELECT new com.mandacarubroker.domain.userswallet.GetAllDataTransferObject(uw.id, ti.name, uw.userId, uw.symbol, uw.amount, uw.price) " +
      "FROM types_investments ti " +
      "JOIN users_wallet uw " +
      "ON ti.id = uw.typeInvestmentId")
  UsersWallet getBySymbol(String symbol);
}
