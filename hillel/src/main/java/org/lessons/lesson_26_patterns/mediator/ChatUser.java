package org.lessons.lesson_26_patterns.mediator;

public class ChatUser extends User {

  public ChatUser(ChatMediator chatMediator, String name) {
    super(chatMediator, name);
  }

  @Override
  public void send(String message) {
    System.out.println(name + " sending: " + message);
  }

  @Override
  public void receive(String message) {
    System.out.println(name + " receive: " + message);
  }
}
