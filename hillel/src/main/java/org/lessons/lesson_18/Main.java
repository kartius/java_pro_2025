package org.lessons.lesson_18;

import java.util.Optional;

public class Main {


  public static void main(String[] args) {


// 1    Optional<String> optional = Optional.of("Hello");
//    if (optional.isPresent()) {
//      System.out.println(optional.get());
//    }

    //2
//    String s = null;
//    Optional<String> optional = Optional.ofNullable(s);
//    System.out.println(optional.orElse("Other object"));

    //3
//    Optional<String> optional = Optional.of("Hello");
//    optional.ifPresent(System.out::println);

    //4
//    Optional<String> optional = Optional.of("Hello");
//    System.out.println(optional.map(String::toUpperCase));

    //5
//    Optional<String> optional = Optional.empty();
//
//    String result = optional.orElseGet(() -> "bla bla bla");
//    System.out.println(result);

    //6
//    Optional<String> optional = Optional.empty();
//    String result = optional.orElseThrow(() -> new RuntimeException("NEMA"));
//    System.out.println(result);

    //7
    Optional<User> user = Optional.of(new User("John"));
    Optional<String> optional = user.flatMap(User::getName);

  }

  static class User {
    private String name;
    public User(String name) { this.name = name; }
    public Optional<String> getName() { return Optional.ofNullable(name); }
  }

}
