package org.lessons.lesson_26_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewAgency {

  private List<Channel> channels = new ArrayList<>();

  public void addObserver(Channel channel) {
    channels.add(channel);
  }

  public void removeObserver(Channel channel) {
    channels.remove(channel);
  }

  public void sendEvent(String event) {
    for (Channel channel : channels) {
      channel.update(event);
    }
  }

}
