package edu.bhscs;

public class Baker {
  // Fields properties
  String name;
  int experienceYears;
  String specialty;

  // Constructor
  public Baker(String name) {
    this.name = name;
    this.experienceYears = 0;
    this.specialty = "Chocolate";
  }

  // Methods
  public Cake bakeCake() {
    // sadasdadasdadasd
    Flour bagOfFlour = new Flour(1, 1, 1, 1);
    Cake myCakeBox = new Cake(this.specialty, bagOfFlour);
    experienceYears++;
    System.out.println("This code functions");

    return myCakeBox;
  }
}
