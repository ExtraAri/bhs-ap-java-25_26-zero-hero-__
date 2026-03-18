package edu.bhscs;

//import javax.sound.sampled.SourceDataLine; <--- idk what that is, how it works, but I don't think its needed

public class Main {

  public static void main(String[] args) {
//REMEMBER: NAME AGE BREED WEIGHT AND OPTIONAL LIKE SERVICEDOGTYPE OR ISMOUSER
///I forgot how to spell chiwawa and autocorrect saved it.
///Issue solved: get rid of abstract in the tabby cat due to not needing the adoptable since its already implemented in pets. I was repeating 3 times in a row with those errors.
///
Dog dog1 = new Dog("Bunky", 3, "German Shepherd", 70, ServiceDogType.BLIND_HELP);
Dog dog2 = new Dog("SuperDog", 23, "Chihuahua", 500, ServiceDogType.MOBILITY_AID);
Cat cat1 = new Cat("SuperJerk", 24,"Tabby", 350, true);

///PRINT HERE TOTALPETS!
      System.out.println("Total pets:" + Pet.getTotalPets());

///PRINT HERE THHE PETS THEMSELVES
/// first we take the species of the dog and print it, then the age and then its service. we also need its weight aswell
System.out.println(dog1.getName() + " is a " + dog1.getSpecies() + " and is " + dog1.getAge() + " years old. " + "This animal weighs " + dog1.getWeight() + " pounds." + " it is a service dog of " + dog1.getService() + ". The adoption fee for this pet is $" + dog1.calculateAdoptionFee());
System.out.println(dog2.getName() + " is a " + dog2.getSpecies() + " and is " + dog2.getAge() + " years old. " + "This animal weighs " + dog2.getWeight() + " pounds." + " it is a service dog of " + dog2.getService() + ". The adoption fee for this pet is $" + dog2.calculateAdoptionFee());
System.out.println(cat1.getName() + " is a " + cat1.getSpecies() + " and is " + cat1.getAge() + " years old. " + "This animal weighs " + cat1.getWeight() + " pounds." + " it is a mouser: " + cat1.isMouser() + ". The adoption fee for this pet is $" + cat1.calculateAdoptionFee());
}

}