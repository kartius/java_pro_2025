package org.lessons.lesson_25_patterns.chainofresponsability;

public class ChainOfLoggers {

  Logger infoLogger = new InfoLogger(Logger.INFO);
  Logger errorLogger = new InfoLogger(Logger.ERROR);
  Logger debugLogger = new InfoLogger(Logger.DEBUG);

  public Logger getLogger() {
    errorLogger.setNextLogger(debugLogger);
    debugLogger.setNextLogger(infoLogger);
    return errorLogger;
  }


}
