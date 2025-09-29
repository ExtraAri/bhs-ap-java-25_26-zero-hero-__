package edu.bhscs;

public class Baker {
  public Baker() {
    System.out.println("There is a baker here");
  }

  public Cake bakeCake() {
    return new Cake("Chocolate");
  }
}
