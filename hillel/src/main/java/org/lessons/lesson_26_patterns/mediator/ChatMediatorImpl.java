package org.lessons.lesson_26_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

  private List<User> users = new ArrayList<>();

  @Override
  public void sendMessage(String message, User sender) {
    for (User user : users) {
      if (user != sender) {
        user.receive(message);
      }
    }
  }

  @Override
  public void addUser(User user) {
    users.add(user);

  }
}
