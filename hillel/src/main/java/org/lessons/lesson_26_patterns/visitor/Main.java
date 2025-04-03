package org.lessons.lesson_26_patterns.visitor;

import java.util.Arrays;
import java.util.List;

public class Main {


  public static void main(String[] args) {
    List<DocumentElement> document =
            Arrays.asList(
                    new Paragraph("Hello, world"),
                    new Image("/home/images/image.jpg"),
                    new Paragraph("Good buy!")
            );

    HtmlExporter htmlExporter = new HtmlExporter();

    for (DocumentElement documentElement : document) {
      documentElement.accept(htmlExporter);
    }

    PlainTextExporter plainTextExporter = new PlainTextExporter();

    for (DocumentElement documentElement : document) {

      documentElement.accept(plainTextExporter);
    }
  }
}
