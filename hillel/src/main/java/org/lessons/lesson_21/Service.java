package org.lessons.lesson_21;

@Autowire
public class Service {

  @HandleException(suppressException = true)
  public void method() throws Exception {
//    System.out.println("I'm bean Service!!!");
    throw new Exception("Error to call method");
  }
}
