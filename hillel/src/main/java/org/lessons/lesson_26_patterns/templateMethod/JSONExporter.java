package org.lessons.lesson_26_patterns.templateMethod;

public class JSONExporter extends DataExporter{
  @Override
  protected void openFile() {
    System.out.println("Opening JSON file...");

  }

  @Override
  protected void writeData() {
    System.out.println("Closing JSON file.");

  }

  @Override
  protected void closeFile() {
    System.out.println("Closing CSV file.");

  }
}
