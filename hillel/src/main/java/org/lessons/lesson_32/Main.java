package org.lessons.lesson_32;

import org.apache.log4j.Logger;

public class Main {

  private final static Logger LOGGER = Logger.getLogger(Main.class);

  public static void main(String[] args) {
    try {
      LOGGER.info("Message info");
      LOGGER.debug("Message debug");
      throw new RuntimeException(" message was failed");
    } catch (Exception e) {
      LOGGER.error("ERROR!!!", e);
    }
  }
}
