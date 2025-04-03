package org.lessons.lesson_26_patterns.templateMethod;

public abstract class DataExporter {

  public final void export() {
    openFile();
    writeData();
    closeFile();
  }

  protected abstract void openFile();

  protected abstract void writeData();

  protected abstract void closeFile();
}
