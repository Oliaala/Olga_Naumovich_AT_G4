package tasks.classwork.day10;

import tasks.classwork.day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TheLast {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Рома Петрович", 72, Person.Sex.MAN));

        List<String> list = Arrays.asList("мама мыла раму");
        list.stream().collect(Collectors.joining(":", "<p>", "</p>"));
        people.stream().collect(Collectors.toMap(x -> x.hashCode(), x -> x));
        people.stream().collect(Collectors.groupingBy(x -> x.getSex())).keySet().forEach(System.out::println);

    }
}
