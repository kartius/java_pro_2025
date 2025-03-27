package org.lessons.lesson_24.builder;

import lombok.ToString;

@ToString
public class Pizza {

  private String sauce;
  private String topping;
  private String cheese;
  private String mushrooms;

  private Pizza(Builder builder) {
    this.sauce = builder.sauce;
    this.topping = builder.topping;
    this.cheese = builder.cheese;
    this.mushrooms = builder.mushrooms;
  }



  public static class Builder {
    private String sauce;
    private String topping;
    private String cheese;
    private String mushrooms;

    public Builder sauce(String sauce) {
      this.sauce = sauce;
      return this;
    }

    public Builder topping(String topping) {
      this.topping = topping;
      return this;
    }

    public Builder cheese(String cheese) {
      this.cheese = cheese;
      return this;
    }

    public Builder mushrooms(String mushrooms) {
      this.mushrooms = mushrooms;
      return this;
    }

    public Pizza build() {
      return new Pizza(this);
    }
  }

}
