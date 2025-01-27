package org.lessons.lesson_10;

public class ClosableResource implements AutoCloseable{
  @Override
  public void close() throws Exception {
    System.out.println("Close my resource");
  }


  public static void main(String[] args) {
    try (ClosableResource closableResource = new ClosableResource()) {

    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
