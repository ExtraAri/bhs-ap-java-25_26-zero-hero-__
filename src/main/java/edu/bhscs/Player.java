package edu.bhscs;

import java.util.Scanner;

public class Player {
  String name;
  Scanner s;

  public Player(String name) {
    this.name = name;
    this.s = new Scanner(System.in);
  }

  public void answerQuestions() {
    System.out.println("What's your question?");
    String question = this.s.next();
    System.out.println(question + "Is a dumb question");
  }
}
