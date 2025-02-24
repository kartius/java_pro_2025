package org.lessons.lesson_17;

import org.lessons.lesson_5.inheritenc.A;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(1);
    integerList.add(3);
    integerList.add(2);

    System.out.println(integerList);

    integerList.removeIf(n -> (n % 3 == 0));
    integerList.forEach(System.out::println);

    Map<Integer, List<String>> map = new HashMap<>();

    map.computeIfAbsent(1, s -> {
      List<String> list = new ArrayList<>();
      list.add("ttt");
      return list;
    });

    map.computeIfAbsent(2, s -> {
      List<String> list = new ArrayList<>();
      list.add("tttrrr");
      return list;
    });

    System.out.println(map);

    map.computeIfPresent(1, (key, value) -> {
      value.add("sfdsfds");
      return value;
    });

    System.out.println(map);

    //Stream<Integer> stream = Stream.empty();

//    Collection<String> collection = Arrays.asList("3", "d", "232");
//    Stream<String> stream = collection.stream();

    //Stream<String> stream = Stream.of("f", "df", "df");

//    String[] arr = new String[] {"d", "d", "df"};
//    Stream<String> stream = Arrays.stream(arr);

    Stream<String> build = Stream.<String>builder().add("df").add("dfdf").add("dfdsf").build();

    Stream<Integer> stream = Stream.iterate(40, n -> n + 2).limit(20);
    System.out.println(stream.collect(Collectors.toList()));


    List<String> list = new ArrayList<>();
    list.add("12");
    list.add("21");
    list.add("3");

    list.forEach(System.out::println);

    Stream<String> stringStream = list.stream().filter(element -> element.contains("1"))
            .filter(element -> element.contains("2"));
    System.out.println(stringStream.collect(Collectors.toList()));

    List<String> uris = new ArrayList<>();

    uris.add("C:\\MyComputer:\\File.txt");

    Set<Path> collect = uris.stream().map(Paths::get).collect(Collectors.toSet());

    List<Car> cars = new ArrayList<>();

    List<List<Passanger>> collect1 = cars.stream().map(Car::getPassangersList).toList();

    List<Integer> primeNumbers = Arrays.asList(5, 7, 11, 13);

    List<Integer> oddNumbers = Arrays.asList(1, 3, 5);

    List<Integer> evenNumbers = Arrays.asList(2, 4, 6);

    final List<List<Integer>> lists = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);

    System.out.println(lists);

    List<Integer> collect2 = lists.stream().flatMap(Collection::stream).toList();
    System.out.println(collect2);


    Map<Integer, List<Passanger>> collect3 = cars.stream().collect(Collectors.toMap(Car::getId, Car::getPassangersList));

    collect2.stream().skip(2).limit(4).distinct().collect(Collectors.toList());

//    final boolean b = uris.stream().anyMatch(element -> element.contains("1"));
//    final boolean a = uris.stream().allMatch(element -> element.contains("1"));
//    final boolean c = uris.stream().noneMatch(element -> element.contains("1"));

    List<Integer> integers = Arrays.asList(1, 1, 1, 1);

    Integer reduce = integers.stream().reduce(23, (a, b) -> a + b);
    System.out.println(reduce);
  }
}
