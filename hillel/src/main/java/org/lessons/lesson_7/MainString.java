package org.lessons.lesson_7;

public class MainString {


  public static void main(String[] args) {
//    String str = new String("str");
//    String str1 = "str1";
//    String str2 =  str + str1;
//    String intern = str.intern();
//    System.out.println(str);
//    System.out.println(str1);
//    System.out.println(str2);
//
//    System.out.println(String.valueOf(1));
//    format("qwerty");
//    format("knfdglkdf");
//
//    System.out.println(String.join(" ", "apple","orange", "kiwi"));
//
//
//    StringBuilder stringBuilder = new StringBuilder();
//    System.out.println(stringBuilder.append("one").append("two").append("three"));


//    String str1 = new String("str");
//    String str2 = new String("str");
//
//    System.out.println(str1 == str2);
//    System.out.println(str1.equals(str2));


    String str1 = "TopJava";
    String str2 = "TopJava";
    String str3 = new String("TopJava");
    String str4 = new String("TopJava");

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));


  }


  public static void format(String str) {
    System.out.println(String.format("Bla bla bla %s", str));
  }
}
