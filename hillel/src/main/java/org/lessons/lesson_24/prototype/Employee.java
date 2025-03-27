package org.lessons.lesson_24.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Cloneable {
  private String name;
  private String department;

  @Override
  protected Employee clone(){
    try {
      return (Employee) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }
}
