package org.lessons.lesson_26_patterns.strategy;

public class Main {

  public static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart();

    shoppingCart.setPaymentStrategy(new CardPayment("1232-2323-4545-3232"));
    shoppingCart.checkout(44);

    shoppingCart.setPaymentStrategy(new CashPayment());

    shoppingCart.checkout(25);

    shoppingCart.setPaymentStrategy(new RevolutPayment("kartius"));
    shoppingCart.checkout(33);

  }
}
