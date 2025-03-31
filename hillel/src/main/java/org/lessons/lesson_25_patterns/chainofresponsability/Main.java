package org.lessons.lesson_25_patterns.chainofresponsability;

public class Main {

  public static void main(String[] args) {
    ChainOfLoggers chainOfLoggers = new ChainOfLoggers();
    Logger logger = chainOfLoggers.getLogger();

    logger.logMessage(Logger.INFO, "this is info message");
    logger.logMessage(Logger.ERROR, "this is error message");
    logger.logMessage(Logger.DEBUG, "this is debug message");
  }
}
