package org.lessons.lesson_30.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.ToString;

@Getter
//@ToString
@Entity
@Table(name = "students")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  @Column(name = "phone_number")
  private String phoneNumber;
  private String description;
  @ManyToOne
  @JoinColumn(name = "group_id")
  private Group group;

  public Student(String name, String phoneNumber, String description, Group group) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.description = description;
    this.group = group;
  }

  public Student() {

  }
}
