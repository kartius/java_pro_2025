package org.lessons.lesson_21;

import java.lang.reflect.Method;

public class ExceptionHandleAnnotationProcessor {

  public void handle(String name) throws ClassNotFoundException {
    Class<?> aClass = Class.forName(name);
    if (aClass.isAnnotationPresent(Autowire.class)) {
      Method[] methods = aClass.getMethods();
      for (Method method : methods) {
        if (method.isAnnotationPresent(HandleException.class)) {
          try {
            method.invoke(Context.MAP.get(name));
          } catch (Exception e) {
            HandleException annotation = method.getAnnotation(HandleException.class);
            if (annotation.suppressException()) {
              System.out.println("Alarma error");
            } else {
              throw new RuntimeException(e);
            }
          }
        }
      }
    }
  }
}
