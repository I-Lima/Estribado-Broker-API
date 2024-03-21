package com.mandacarubroker.domain.userswallet;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The Users Wallet class.
 * */
@Table(name = "users_wallet")
@Entity(name = "users_wallet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class UsersWallet {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  @Column(name = "user_id")
  private String userId;
  @Column(name = "type_investment_id")
  private String typeInvestmentId;
  private String symbol;
  private Integer amount;
  private Double price;

  public UsersWallet(RegisterDataTransferObject data) {
    this.userId = data.userId();
    this.typeInvestmentId = data.typeInvestmentId();
    this.symbol = data.symbol();
    this.amount = data.amount();
    this.price = data.price();
  }
}
