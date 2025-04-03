package org.lessons.lesson_26_patterns.state;

public class UnlockedState implements TurnstileState {
  @Override
  public void insertCoin(Turnstile context) {
    System.out.println("Already unlocked. No need to insert another coin.");

  }

  @Override
  public void push(Turnstile context) {
    System.out.println("Pushed. Locking turnstile.");
    context.setState(new LockedState());
  }
}
