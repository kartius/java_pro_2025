package org.example.spring_boot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


public class Student {

  private int id;
  private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
