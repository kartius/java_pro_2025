package org.lessons.lesson_26_patterns.strategy;

public class CardPayment implements PaymentStrategy {
  String cardNumber;

  public CardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  @Override
  public void pay(int amount) {
    System.out.println("Paid $" + amount + " using credit card: " + cardNumber);
  }
}
