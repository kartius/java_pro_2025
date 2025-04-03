package org.lessons.lesson_26_patterns.state;

public class Turnstile {
  private TurnstileState state;

  public Turnstile() {
    state = new LockedState();
  }

  public void setState(TurnstileState state) {
    this.state = state;
  }

  public void insertCoin() {
    state.insertCoin(this);
  }

  public void push(){
    state.push(this);
  }


}
