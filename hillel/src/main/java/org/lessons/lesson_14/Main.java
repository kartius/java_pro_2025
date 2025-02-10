package org.lessons.lesson_14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {


  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");

    LinkedList<String> linkedList = new LinkedList<>();

//1    for (String string : list) {
//      if (string.equals("C")) {
//        list.remove(string);
//      }
//    }

// 2   Iterator<String> iterator = list.iterator();
//
//    while (iterator.hasNext()) {
//      String next = iterator.next();
//      if (next.equals("C")) {
//        iterator.remove();
//      }
//    }

    final ListIterator<String> stringListIterator = list.listIterator();

    while (stringListIterator.hasNext()) {
      final String element = stringListIterator.next();
      stringListIterator.set(element + " +");
    }

    final ListIterator<String> stringListIteratorAfterChange = list.listIterator();
    while (stringListIteratorAfterChange.hasNext()) {
      System.out.println(stringListIteratorAfterChange.next());
    }


    System.out.println("-------------------------");
    while (stringListIterator.hasPrevious()) {
      System.out.println(stringListIterator.previous() + " ");
    }

  }
}
