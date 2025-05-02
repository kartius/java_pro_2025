package org.lessons.lesson_33;

import org.example.model.Account;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {

  public static void main(String[] args) throws IOException {
    Account account = new Account(1, "first", "second", "common");

    try (FileOutputStream fileOutputStream = new FileOutputStream("account.txt")) {
      try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
        objectOutputStream.writeObject(account);
      }
    }
  }
}
