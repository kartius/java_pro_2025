package org.lessons.lesson_9.generics_extend;

import org.lessons.lesson_5.inheritenc.A;

import java.util.ArrayList;
import java.util.List;

public class AdvancedBox {


  public void sumNumbers(List<? extends Number> list) {
    double result = 0;
    for (Number number : list) {
      result += number.doubleValue();
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    AdvancedBox advancedBox = new AdvancedBox();

    List<Double> doubleList = new ArrayList<>();
    doubleList.add(5.5);
    doubleList.add(5.5);
    doubleList.add(5.5);
    doubleList.add(5.5);
    doubleList.add(5.5);


    advancedBox.sumNumbers(doubleList);

    List<Integer> integerList = new ArrayList<>();
    integerList.add(4);
    integerList.add(4);
    integerList.add(4);
    integerList.add(4);
    integerList.add(4);

    advancedBox.sumNumbers(integerList);



  }

}
