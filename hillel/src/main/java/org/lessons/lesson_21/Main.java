package org.lessons.lesson_21;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
//    System.out.printf("Create user with id %s, %s, %s%n", 1, 5, 7);

    Service service = new Service();
    Class<? extends Service> aClass = service.getClass();
    Class clas1 = Class.forName("org.lessons.lesson_21.Service");

    inspectClass(aClass);
    inspectClass(clas1);
    inspectClass(String.class);
    inspectMethods(aClass);

    Context context = new Context();
    ExceptionHandleAnnotationProcessor processor = new ExceptionHandleAnnotationProcessor();
    Service bean = (Service) context.getBean("org.lessons.lesson_21.Service");
    processor.handle("org.lessons.lesson_21.Service");

    bean.method();
  }

  static void inspectClass(Class<?> aClass) {
    System.out.println(aClass.getName());
    if (aClass.isAnnotationPresent(Autowire.class)) {
      System.out.println("Annotated");
    }
  }

  static void inspectMethods(Class<?> aClass) {
    Method[] methods = aClass.getMethods();
    Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));
  }
}
