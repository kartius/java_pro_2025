package org.lessons.lesson_9.without_generics;

public class Box {

  private Object item;

  public Object getItem() {
    return item;
  }

  public void setItem(Object item) {
    this.item = item;
  }

  public static void main(String[] args) {

    Box box = new Box();

    box.setItem(Integer.valueOf(2));

    box.setItem(new String("dfdf"));

    if (box.getItem() instanceof Integer) {
      Integer item1 = (Integer) box.getItem();
      System.out.println(item1.byteValue());
    } else if (box.getItem() instanceof String) {
      String item1 = (String) box.getItem();
      System.out.println(item1.toUpperCase());
    }
  }
}
