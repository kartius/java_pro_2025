package org.lessons.lesson_26_patterns.state;

public class LockedState implements TurnstileState {
  @Override
  public void insertCoin(Turnstile context) {
    System.out.println("Coin inserted: unlocking turnstile.");
    context.setState(new UnlockedState());
  }

  @Override
  public void push(Turnstile context) {
    System.out.println("Turnstile is locked. Can't push!");
  }
}
