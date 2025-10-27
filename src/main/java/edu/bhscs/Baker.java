package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;
  String name = "Bob, Ted, Alice";
  int skill = 1;

  // CONSTRUCTOR
  public Baker(String name) {
    this.name = name;
  }

  Baker(Player p) {
    this.p = p;
  }

  // METHODS
  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    /// c.takeCake(bakeCake());
  }

  public void learn(int amount) {
    this.skill += amount;
  }

  /*Cake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you you want?");
    this.skill++;
    return new Cake(answer, this.f, this.skill);
  }
    */

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = ("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }
}

/*public class Baker {
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
*/
