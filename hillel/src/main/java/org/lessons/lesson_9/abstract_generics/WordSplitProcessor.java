package org.lessons.lesson_9.abstract_generics;

import java.util.ArrayList;
import java.util.List;

public class WordSplitProcessor extends Processor<String, List<Character>>{


  public WordSplitProcessor(String id, String type, String data) {
    super(id, type, data);
  }

  @Override
  public List<Character> process() {
    List<Character> characters = new ArrayList<>();
    for (char c : data.toCharArray()) {
      characters.add(c);
    }
    return characters;
  }


  public static void main(String[] args) {
    WordSplitProcessor processor = new WordSplitProcessor("worlddProcessor", "worldProcessorType", "lkfslkfjsldfjlsd");
    System.out.println(processor.process());
  }
}
