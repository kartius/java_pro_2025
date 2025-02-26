package org.lessons.lesson_16;

public class TestImpl implements TestInterface, TestInterface2 {
  @Override
  public int calculate(int a1, int a2) {
    return a1 + a2;
  }

  @Override
  public String getConstant() {
    return TestInterface2.super.getConstant();
  }

  public static void main(String[] args) {
//    TestImpl sum = new TestImpl();
//    System.out.println(sum.calculate(3,5));

//    TestInterface sum = new TestInterface() {
//      @Override
//      public int calculate(int a1, int a2) {
//        return a1+a2;
//      }
//    };
//    sum.calculate(2,5);


    //1 TestInterface sum = (int a1, int a2) -> {return a1 + a2;};

    //2 TestInterface sum = (int a1, int a2) -> a1 + a2;

    //3 TestInterface sum = (a1, a2) -> a1 + a2;

    //4 TestInterface sum = (a1, a2) -> Integer.sum(a1, a2);

    TestInterface sum = Integer::sum;
    System.out.println(sum.calculate(4 ,6));






  }
}
