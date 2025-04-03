package org.lessons.lesson_26_patterns.mediator;

public class Main {


  public static void main(String[] args) {
    ChatMediator chatMediator = new ChatMediatorImpl();

    User alice = new ChatUser(chatMediator, "Alice");
    User bob = new ChatUser(chatMediator, "Bob");
    User charlie = new ChatUser(chatMediator, "Charlie");

    chatMediator.addUser(alice);
    chatMediator.addUser(bob);
    chatMediator.addUser(charlie);

    alice.send("Hello!!!");
    bob.send("I'm Bob");
  }
}
