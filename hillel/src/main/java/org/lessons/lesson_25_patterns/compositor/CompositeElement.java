package org.lessons.lesson_25_patterns.compositor;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements Element{

  List<Element> elementList = new ArrayList<>();

  public CompositeElement(Element... elements) {
    elementList.addAll(List.of(elements));
  }

  @Override
  public int getPrice() {
    return elementList.stream().map(Element::getPrice).mapToInt(Integer::intValue).sum();
  }
}
