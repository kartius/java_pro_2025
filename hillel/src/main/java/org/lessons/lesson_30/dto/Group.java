package org.lessons.lesson_30.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@Entity
@Table(name = "hillel_groups")
public class Group {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  @OneToMany(mappedBy = "group")
  private List<Student> students;

  public Group(String name) {
    this.name = name;
  }

  public Group() {
  }
}
