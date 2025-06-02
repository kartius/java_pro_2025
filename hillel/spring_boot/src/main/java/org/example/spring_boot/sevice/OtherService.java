package org.example.spring_boot.sevice;

import lombok.AllArgsConstructor;
import org.example.spring_boot.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OtherService {

  private StudentService studentService;

  @Autowired
  private List<MyComponent> myComponentList;

  public OtherService(StudentService studentService) {
    this.studentService = studentService;
  }

  public void printAllStudents() {
    System.out.println(studentService.getStudents());
    for (MyComponent myComponent : myComponentList) {
      System.out.println(myComponent);
    }
  }
}
