public class Flour {
  // Fields and properties
  int price;
  int lbs;
  int quality;

  public Flour(int quality, int price, int quantity, int lbs) {
    // constructor
    this.price = price;
    this.lbs = lbs;
    this.quality = 5;
  }

  public void goesBad() {
    this.quality = 0;
  }

  // methods
}
