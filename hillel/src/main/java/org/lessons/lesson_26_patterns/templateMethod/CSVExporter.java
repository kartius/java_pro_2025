package org.lessons.lesson_26_patterns.templateMethod;

public class CSVExporter extends DataExporter{
  @Override
  protected void openFile() {
    System.out.println("Opening CSV file...");

  }

  @Override
  protected void writeData() {
    System.out.println("Writing data in CSV format.");

  }

  @Override
  protected void closeFile() {
    System.out.println("Closing CSV file.");

  }
}
