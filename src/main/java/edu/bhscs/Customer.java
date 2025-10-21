package edu.bhscs;

public class Customer {
  // fields and properties
  String name;
  private int walletMoney;

  public Customer(String cake, int walletmoney) {
    this.name = cake;
    this.walletMoney = walletmoney;
  }

  // methods
  public int pay(int amount) {
    if (amount <= walletMoney) {
      walletMoney -= amount;
      return amount;
    } else {
      return 0; // Not enough money
    }
  }

  public String getName() {
    return name;
  }

  public int getWalletMoney() {
    return walletMoney;
  }

  public String takeCake(Cake c) {
    return "Yum! I got a " + " cake!";
  }
}
