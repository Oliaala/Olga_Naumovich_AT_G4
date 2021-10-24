package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyVegetables {

    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String x : vegetables) {
            System.out.println(x);
        }

        System.out.println();

        int count = 0;

        for (String x : vegetables) {
            if (x.contains("а")) {
                count++;
            }
        }
        System.out.println(count);

        vegetables.remove("Огурец");
        vegetables.remove(3);

        System.out.println();

        for (String x : vegetables) {
            System.out.println(x);
        }
    }

}


