package org.lessons.lesson_29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/hillel";
    String username = "root";
    String password = "password";

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
      try (Statement statement = connection.createStatement()) {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
          while (resultSet.next()) {
            System.out.println("id: " + resultSet.getInt("id"));
            System.out.println("name: " + resultSet.getString("name"));
            System.out.println("phone_number: " + resultSet.getString("phone_number"));
            System.out.println("description: " + resultSet.getString("description"));
            System.out.println("hillel_group_id: " + resultSet.getInt("hillel_group_id"));
          }
        }
      }
      try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students " +
              "(name, phone_number, description, hillel_group_id) VALUES (?,?,?,?)")) {
        preparedStatement.setString(1, "Dmytro");
        preparedStatement.setString(2, "34324");
        preparedStatement.setString(3, "student Dmytro looking forward ORM");
        preparedStatement.setString(4, "1");
        System.out.println(preparedStatement.executeUpdate());
      }
    }
  }
}
