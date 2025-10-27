package edu.bhscs;

public class App {
  public static void main(String[] args) {
    date10_27();
    // Player user = new Player("me");
    // System.out.println(user);
    //  new Cake().draw("Druv","11");

    // new Cake().draw("name", "age");

  }

 public static void date10_27() {
    Baker bob = new Baker("Bob");
    Table t   = new Table(3, 15);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(t);
  }

}
