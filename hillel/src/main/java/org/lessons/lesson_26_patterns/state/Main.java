package org.lessons.lesson_26_patterns.state;

public class Main {


  public static void main(String[] args) {
    Turnstile turnstile = new Turnstile();

    turnstile.push();

    turnstile.insertCoin();
    turnstile.insertCoin();

    turnstile.push();
    turnstile.push();
  }
}
