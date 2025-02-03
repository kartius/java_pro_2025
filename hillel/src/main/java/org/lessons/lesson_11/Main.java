package org.lessons.lesson_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {


  public static void main(String[] args) throws IOException {
    Files.writeString(Paths.get("Test.txt"), "22131231231");


    System.out.println(Files.readString(Paths.get("Test.txt")));



  }
}
