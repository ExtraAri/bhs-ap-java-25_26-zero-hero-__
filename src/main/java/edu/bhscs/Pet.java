package edu.bhscs;

/// pet class information to implement
public abstract class Pet implements Adoptable {
  private static int totalPets = 0;
  private String name;
  private int age;
  private String breed;
  private int weight;

  /// constructor! need to hold 3, name, age, breed, weight!
  public Pet(String name, int age, String breed, int weight) {
    this.name = name;
    this.age = age;
    this.breed = breed;
    this.weight = weight;
    totalPets++;
  }

  /// do not forget to implement getSpecies() method. it also is an abstract method.
  abstract String getSpecies();

  /// do not forget getTotalPets(). need it for later.
  public static int getTotalPets() {
    return totalPets;
  }

  /// get and set all the information so we can call it and use it in the main method later.
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  private void setAge(int age) {
    this.age = age;
  }

  public String getBreed() {
    return breed;
  }

  private void setBreed(String breed) {
    this.breed = breed;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
