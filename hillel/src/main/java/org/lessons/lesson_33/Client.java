package org.lessons.lesson_33;

import org.example.model.Account;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Hello world!
 */
public class Client {

  public static void main(String[] args) throws IOException {
//    try (Socket socketClient = new Socket("localhost", 1111)) {
//      try (PrintWriter printWriter = new PrintWriter(socketClient.getOutputStream(), true)) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//          printWriter.println(sc.next());
//        }
//      }
//    }

    try (Socket socketClient = new Socket("localhost", 1111)) {

      try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(socketClient.getOutputStream())) {

        for (int i = 0; i < 100; i++) {
          Account account = new Account(i, "first" + i, "last" + i, "common" + i);
          objectOutputStream.writeObject(account);
        }
        objectOutputStream.flush();
      }
    }
  }
}

