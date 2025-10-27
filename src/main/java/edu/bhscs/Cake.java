package edu.bhscs;

/// CREATE A FUNCTIONING CAKE CLASS THAT WORKS WITH THE MAIN CLASS - DONE
/// WHAT I WANT TO DO TODAY IS CREATE AN X Y AND Z AXIS FOR A CAKE  - DONE
/// MAKE IT PRINT SOMETHING FOR THAT CAKE - DONE
/// MAKE IT SO IT IS A LOOP SO IT PRINTS MULTIPLE TIMES - DONE
/// MAKE IT WHEN IT PRINTS, IT SUCCESSFULLY PRINTS A CAKE -DONE
public class Cake {
  // FIELDS AND PROPERTIES
  String frosting = "####";
  String color;
  int weight;
  String flavor;
  Flour flour;
  int quality;
  int price;
  // dimensions of a cake
  int size;
  int height;
  int x;
  int y;
  int z;

  // I have to make a constructor
  public Cake(String ingredient, Flour flour, int skill, int size, int height) {
    // CONSTRUCTOR
    this.flour = flour;
    this.weight = 10;
    this.quality = skill;
    this.size = size;
    this.height = height;
    this.color = ingredient;
    this.frosting = "yumm";
  }

  public Cake() {}
  ;

  // METHODS

  /*  public void draw(String name, String age){
    System.out.println("I am drawing!");
  for (int y = 0; y < 5; y++);{
    for(int x=0; x<10; x++){

      System.out.println("l");
      System.out.println("o");
      System.out.println("t");
      System.out.println("s");
    }
  }
  */

  public void printCake() {
    for (int i = 0; i < 5; i++) {
      System.out.println(this.frosting);
    }
  }

  public void growCake(int x, int y, int z) {
    this.x += x;
    this.y += y;
    this.z += z;
  }

  ///
  ///            _         __
  /// ///////// /_________/  \
  /// ||||||||| #########     |
  /// ||||||||| #########     |
  /// ||||||||| #########     |
  /// ||||||||| #########     |
  /// ||||||||| #########    /
  /// ||||||||| #########   /
  /// ||||||||| #########  /
  public void draw() {
    for (int y = 0; y < this.y; y++) {
      for (int x = 0; x < this.x; x++) {
        System.out.print("#");
      }
      for (int z = 0; z < this.z; z++) {
        System.out.print("   |");
      }
      System.out.println(" ");
    }
    for (int i = 0; i < 3; i++) {
      for (int x = 0; x < this.x; x++) {
        System.out.print("#");
      }
      for (int w = i; w < 2; w++) {
        System.out.print(" ");
      }
      System.out.println("/");
    }
  }

public void draw(Table t){
  this.draw();
  t.draw();
}
}
