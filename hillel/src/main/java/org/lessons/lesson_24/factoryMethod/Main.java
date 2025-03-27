package org.lessons.lesson_24.factoryMethod;

public class Main {


  public static void main(String[] args) {
    AbstractFactory factory = new Factory();
    factory.crateStorage(StorageType.DB).store("dnfgkjfngkjdhgkjfdg");
    factory.crateStorage(StorageType.FILE).store("dnfgkjfngkjdhgkjfdg");
    factory.crateStorage(StorageType.IN_MEMORY).store("dnfgkjfngkjdhgkjfdg");

    AbstractFactory factory1 = new LoggerFactory();
    factory1.crateStorage(StorageType.DB).store("dnfgkjfngkjdhgkjfdg");
    factory1.crateStorage(StorageType.FILE).store("dnfgkjfngkjdhgkjfdg");
    factory1.crateStorage(StorageType.IN_MEMORY).store("dnfgkjfngkjdhgkjfdg");
  }
}
