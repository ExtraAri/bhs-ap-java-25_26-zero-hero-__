package edu.bhscs;
public class Customer {
  // fields and properties
  private String name;
  private int walletMoney;

  public Customer(String name, int walletmoney) {
    this.name = name;
    this.walletMoney = walletmoney;
  }

  // methods

  public String getName() {
    return name;
  }

  public int getWalletMoney() {
    return walletMoney;
  }
}
