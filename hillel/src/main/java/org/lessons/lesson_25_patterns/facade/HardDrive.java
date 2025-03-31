package org.lessons.lesson_25_patterns.facade;

public class HardDrive {

  byte[] read(long lba, int size) {
    System.out.println("Reading data from LBA: " + lba + ", size: " + size);
    return new byte[size];
  }
}
