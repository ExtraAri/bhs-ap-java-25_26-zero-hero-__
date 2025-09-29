// Ari Bernstein
// P2
// Zero Hero
// 9/19/25
/*
 *DESCRIPTION
 *Baker make a cake
 *bake it at a bakery
 sel it to a customer
 deliver money to PTA
 */
/*
 * DESCRIPTION:
 * INPUT:
 * OUTPUT:
 * EDGE CASE:
 */

package edu.bhscs;

public class Main {
  Baker myBaker = new Baker();
  Cake cakeFromBaker = myBaker.bakeCake();
  Store DowntownStore = new Store("Downtown", "Chocolate Cake");
  Toppings availableToppings = new Toppings("Oreo", "Sprinkles", "Whipped Cream", "Ice Cream", "Cherries", "Nuts", "Syrup");

  public static void main(String[] args) {

    String theGoodStuff = "chocolate";
    Cake TheOneBestCake = new Cake(theGoodStuff);
    TheOneBestCake.eaten();
  }
  // to be weighed

}
