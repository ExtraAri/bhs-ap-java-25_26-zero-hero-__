package edu.bhscs;

public class Cake {

  String ingredient;
  String otherIngredient;
  int weight;
  String flavor;

  /// I have to make a constructor
  public Cake(String ingredient, Flour flour) {
    System.out.println("Baking the cake with....." + ingredient + " Nah we only got vanilla");
    this.flour = flour;
    this.weight = 10;
  }

  String getDisplay() {
    return flavor;
  }

  // to be eaten
  public void eaten() {
    this.weight = this.weight - 2;
  }

  public int getWeight() {
    return this.weight;
  }
}
