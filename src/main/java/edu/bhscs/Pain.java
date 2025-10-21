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

public class Pain {
  public static void main(String[] args) {
    System.out.println("Whats popping");
    new Cake("Chocolate", new Flour(1, 1, 1, 1), 3, 2, 2);
  }

  Baker myBaker = new Baker("Mr. Mrs");

  /// Store DowntownStore = new Store("Downtown", "Chocolate Cake");

  Toppings availableToppings =
      new Toppings("Oreo", "Sprinkles", "Whipped Cream", "Ice Cream", "Cherries", "Nuts", "Syrup");

  Customer Bob = new Customer("Bob", 20);
  Customer Bartholemew = new Customer("Bartholemew", 25);
  Customer[] customers = {Bob, Bartholemew};

  /// customers[0].buyCake(cakeFromBaker);

  /*public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("What can we do with a scanner?");

      System.out.println("What is your favourite color?");
      String color = s.next();
      System.out.println("Your favourite color is " + color);

      System.out.println("I don't know, but I'm done now!!!!");
      createBurger();
      s.close();
      /// String theGoodStuff = "chocolate";
      /// Cake TheOneBestCake = new Cake(theGoodStuff);
      /// TheOneBestCake.eaten();
    }
  */
  public static String breadGuts(int width) {
    String guts = "";
    for (var i = 0; i < width; i++) {
      guts += "";
    }
    return guts;
  }

  public static void createBurger() {
    for (int i = 0; i < 10; i++) {
      System.out.println("   //" + breadGuts(10) + "\\\\");
    }
  }
  // to be weighed

}
