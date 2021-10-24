package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyName {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String x : names) {
            System.out.println(x);
        }

        names.set(2, "Оля");
        names.set(4, "Катя");

        names.remove("Оля");
        names.remove(3);

        System.out.println();

        for (String x : names) {
            System.out.println(x);
        }
    }

}


