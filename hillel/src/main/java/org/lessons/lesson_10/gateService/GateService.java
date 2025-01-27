package org.lessons.lesson_10.gateService;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class GateService {
  private Configuration configuration;


  public GateService() {
    configuration = new Configuration();
    configuration.readProperties("config.txt");
  }

  public void open() {
    logging("INFO: " + LocalDateTime.now() + " Gate was opened");

  }


  public void close() {
    String message;
    LocalDateTime time = LocalDateTime.now();
    String s = time.toString();
    String substring = s.substring(s.length() - 1);
    int i = Integer.parseInt(substring);
    if (i == 5) {
      message = "ERROR: " + time + " Gate was closed wrong.!!!";
    } else {
      message = "INFO: " + time + " Gate was closed";
    }
    logging(message);

  }

  private void logging(String message) {
    String environment = configuration.getEnvironment();
    if (environment.equals("dev")) {
      System.out.println(message);
    } else if (environment.equals("prod")) {
      try (PrintWriter w = new PrintWriter(new FileWriter("logFile.txt", true))) {
        w.println(message);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
