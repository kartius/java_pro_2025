package org.example.spring_boot.sevice;

import org.example.spring_boot.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

  private final Map<Integer, Student> students = new HashMap<>();

  public Map<Integer, Student> getStudents(){
    return students;
  }

  public void addStudent(Student student) {
    students.put(student.getId(), student);
  }


}
