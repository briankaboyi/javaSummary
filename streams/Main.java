package streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

  public static void main(String args[]) {
    List<Person> billionares = new ArrayList<>();
    billionares.add(new Person("jeff", 120));
    billionares.add(new Person("elon", 200));
    billionares.add(new Person("buffet", 100));
    billionares.add(new Person("mark", 50));

    // filter
    List<Person> hundredClub = billionares
      .stream()
      .filter(p -> p.billions >= 100)
      .collect(Collectors.toList());

    // hundredClub.forEach(p -> System.out.println(p.name));
    // sort
    List<Person> sortedList = hundredClub
      .stream()
      .sorted(Comparator.comparing(person -> person.name))
      .collect(Collectors.toList());

    List<Person> testList = hundredClub
      .stream()
      .sorted(Comparator.comparing(person -> person.name))
      .collect(Collectors.toList());
    System.out.println(testList + "ddddddddddddddddddddddddddddd4");

    sortedList.forEach(p -> System.out.println(p.name));
    //filter and sort
    List<Person> hundredSortedClub = billionares
      .stream()
      .filter(p -> p.billions >= 100)
      .sorted(Comparator.comparing(p -> p.name))
      .collect(Collectors.toList());

    hundredSortedClub.forEach(p -> System.out.println(p.name));
    // List<Person> hundredClub = new ArrayList<>();
    // for (Person p : billionares) {
    //   if (p.billions >= 100) {
    //     hundredClub.add(p);
    //   }
    // }

    // hundredClub.forEach(p -> System.out.println(p.name));
  }

  static class Person {

    String name;
    int billions;

    public Person(String name, int billions) {
      this.name = name;
      this.billions = billions;
    }
  }
}
