package edu.bhscs;

/// already implemented adoptable so don't need to implement it again due to it being in pet.
public class Dog extends Pet {
  private ServiceDogType service;

  public Dog(String name, int age, String breed, int weight, ServiceDogType service) {
    super(name, age, breed, weight);
    this.service = service;
  }
///I need this so if its a service dog, its value rises.
  public double calculateAdoptionFee() {
    double fee = BASE_FEE;
    if (service == ServiceDogType.BLIND_HELP) {
      fee += 100.0;
    }
    return fee;
  }

  public String getSpecies() {
    return "Dog";
  }
  //I don't think I need to set the species since its fixed as dog from beginning. BUT service dog can always be changes so I need that.

  public ServiceDogType getService() {
    return service;
  }

  public void setService(ServiceDogType service) {
    this.service = service;
  }
}
