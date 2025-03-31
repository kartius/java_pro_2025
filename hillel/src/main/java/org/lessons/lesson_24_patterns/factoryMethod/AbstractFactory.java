package org.lessons.lesson_24_patterns.factoryMethod;

public abstract class AbstractFactory {

  public abstract DataStorage crateStorage(StorageType type);
}
