package edu.bhscs;

public class Table {
  //fields and properties
  int legs;
  int width;

  //constructor
  public Table(int legs, int width){
    this.legs = legs;
    this.width = width;
  System.out.println("ITS ALIVE!");
  }

public void draw(){
  for(int i =0; i< this.legs; i++){
    System.out.println("|   |");
    for(int j=0; j< this.width; j++){
      System.out.print("-");
    }
    System.out.println();
  }
}
  //methods
}
