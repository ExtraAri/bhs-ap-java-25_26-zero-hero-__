package edu.bhscs;

public class Store {

  // Properties fields ===> things the store HAS!!!!!
  String name;

  // Constructor
  public Store(String location, String Cake, String name) {
    this.name = name;
    System.out.println("Welcome to the store at " + location + " We have " + Cake + " cake!");
  }

  // METHODS
  String getName() {
    return this.name;
  }
}
;


/*
 *
 *  int x = 7;
 * String flavor = "Blue Icing";
 * { ........ }
 *
 * system.out.println(flavor);
 *
 *
 *
 *
 *
 *
 *
 *
 */
