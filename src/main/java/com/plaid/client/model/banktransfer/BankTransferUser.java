package com.plaid.client.model.banktransfer;

public class BankTransferUser {
  private String legalName;
  private String emailAddress;
  private String routingNumber;

  public BankTransferUser(String legalName) {
    this.legalName = legalName;
  }

  public BankTransferUser withEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public BankTransferUser withRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public String getLegalName() {
    return legalName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getRoutingNumber() {
    return routingNumber;
  }
}