package org.lessons.lesson_24_patterns.factoryMethod;

public class Factory extends AbstractFactory{

  public DataStorage crateStorage(StorageType type) {
    switch (type) {
      case DB -> {
        return new DBStorage();
      }
      case FILE -> {
        return new FileStorage();
      }
      case IN_MEMORY -> {
        return new InMemoryStorage();
      }
    }
    throw new RuntimeException("Did'n find type");
  }
}
