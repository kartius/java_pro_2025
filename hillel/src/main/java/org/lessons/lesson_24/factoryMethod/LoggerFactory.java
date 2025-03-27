package org.lessons.lesson_24.factoryMethod;

public class LoggerFactory extends AbstractFactory{
  @Override
  public DataStorage crateStorage(StorageType type) {
    switch (type) {
      case DB -> {
        System.out.println("Logger factory logs DB Stoarage");
        return new DBStorage();
      }
      case FILE -> {
        System.out.println("Logger factory logs File Stoarage");

        return new FileStorage();
      }
      case IN_MEMORY -> {
        System.out.println("Logger factory logs In memory Stoarage");

        return new InMemoryStorage();
      }
    }
    throw new RuntimeException("Did'n find type");
  }
}
