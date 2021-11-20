package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class SumLetters {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама мыла раму");
        list.stream().map(String::length).mapToInt(x -> {
            if (x % 2 == 0) {
                return 0;
            } else {
                return x;
            }
        });
        }
    }
