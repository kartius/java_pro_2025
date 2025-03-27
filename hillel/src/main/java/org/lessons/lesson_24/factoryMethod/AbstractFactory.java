package org.lessons.lesson_24.factoryMethod;

public abstract class AbstractFactory {

  public abstract DataStorage crateStorage(StorageType type);
}
