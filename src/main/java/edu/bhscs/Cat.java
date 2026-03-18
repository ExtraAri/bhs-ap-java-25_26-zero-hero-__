package edu.bhscs;

/// already implemented adoptable so don't need to implement it again due to it being in pet.
public class Cat extends Pet {
  private boolean isMouser;

  public Cat(String name, int age, String breed, int weight, boolean isMouser) {
    super(name, age, breed, weight);
    this.isMouser = isMouser;
  }

  String getSpecies() {
    return "Cat";
  }

  public double calculateAdoptionFee() {
    if(isMouser == true) {
      return 50.0;
    } else {
      return 30.0;
    }

    }

    public boolean isMouser() {
      return isMouser;
  }
  public void setMouser (boolean isMouser){
    this.isMouser = isMouser;
  }
}
