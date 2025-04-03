package org.lessons.lesson_26_patterns.state;

public interface TurnstileState {

  void insertCoin(Turnstile context);

  void push(Turnstile context);

}
