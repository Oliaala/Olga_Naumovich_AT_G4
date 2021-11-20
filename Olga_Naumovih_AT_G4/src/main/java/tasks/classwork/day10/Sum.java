package tasks.classwork.day10;

import tasks.classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sum {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама мыла раму");
        list.stream().flatMap(x -> Arrays.stream(x.split(""))).count();

    }
}