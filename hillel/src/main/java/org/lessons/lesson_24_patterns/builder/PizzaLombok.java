package org.lessons.lesson_24_patterns.builder;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class PizzaLombok {

  private String sauce;
  private String topping;
  private String cheese;
  private String mushrooms;

}
