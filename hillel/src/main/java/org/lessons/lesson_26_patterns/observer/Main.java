package org.lessons.lesson_26_patterns.observer;

public class Main {

  public static void main(String[] args) {
    NewAgency observable = new NewAgency();

    Channel emailChannel = new EmailChannel();
    Channel pushChannel = new MobilePushChannel();

    observable.addObserver(emailChannel);
    observable.addObserver(pushChannel);


    observable.sendEvent("dfsdsfdsfdsf");

    observable.removeObserver(emailChannel);

    observable.sendEvent("3213213213213");

  }
}
