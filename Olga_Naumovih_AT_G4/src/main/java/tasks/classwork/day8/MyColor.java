package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyColor {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String x : colors) {
            System.out.println(x);
        }

        colors.add(2, "Pink");
        colors.add(4, "Yellow");

        System.out.println(colors.get(1) + colors.get(5));


    }

}
