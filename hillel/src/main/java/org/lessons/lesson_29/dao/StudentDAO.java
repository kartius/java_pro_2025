package org.lessons.lesson_29.dao;

import lombok.AllArgsConstructor;
import org.lessons.lesson_29.dto.Student;
import org.lessons.lesson_5.inheritenc.A;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class StudentDAO {
  private Connection connection;

  public int add(Student student) throws SQLException {
    try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students " +
            "(name, phone_number, description, hillel_group_id) VALUES (?,?,?,?)")) {
      preparedStatement.setString(1, student.getName());
      preparedStatement.setString(2, student.getPhoneNumber());
      preparedStatement.setString(3, student.getDescription());
      preparedStatement.setInt(4, student.getGroupId());
      return preparedStatement.executeUpdate();
    }
  }

  public List<Student> getAll() throws SQLException {
    List<Student> students = new ArrayList<>();
    try (Statement statement = connection.createStatement()) {
      try (ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
        while (resultSet.next()) {
          students.add(new Student(
                  resultSet.getInt("id"),
                  resultSet.getString("name"),
                  resultSet.getString("phone_number"),
                  resultSet.getString("description"),
                  resultSet.getInt("hillel_group_id")));
        }
        return students;
      }
    }
  }
}
