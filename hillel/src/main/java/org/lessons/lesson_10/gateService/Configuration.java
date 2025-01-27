package org.lessons.lesson_10.gateService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Configuration {

  private String environment;


  public void readProperties(String fileName) {
    try (BufferedReader r = new BufferedReader(new FileReader(fileName))) {
      String line;

      while ((line = r.readLine()) != null) {
        String[] properties = line.split("=");
        if (properties[0].equals("environment")) {
          environment = properties[1];
        }
      }


    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public String getEnvironment() {
    return environment;
  }
}
