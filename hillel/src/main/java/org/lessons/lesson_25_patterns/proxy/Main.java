package org.lessons.lesson_25_patterns.proxy;

public class Main {


  public static void main(String[] args) {

    Image image = new ProxyImage("128.4343.99://home/photos.1,jpeg");

    image.display();
    image.display();

  }
}
