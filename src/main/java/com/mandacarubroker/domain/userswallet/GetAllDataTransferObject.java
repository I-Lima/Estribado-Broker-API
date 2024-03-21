package com.mandacarubroker.domain.userswallet;

public record GetAllDataTransferObject (
  String id,
  String type_investment,
  String userId,
  String symbol,
  Integer amount,
  Double price
){}
