package org.lessons.lesson_26_patterns.templateMethod;

public class Main {

  public static void main(String[] args) {
    DataExporter csv = new CSVExporter();
    DataExporter json = new JSONExporter();

    csv.export();

    json.export();
  }
}
