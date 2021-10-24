package tasks.classwork.day8;

import java.util.*;

public class MyHashTreeSet<myList1> {
    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();
        String text = "мама мыла раму мыла";

        long x = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add(text);
        }
        System.out.println("Differences" + (System.currentTimeMillis() - x));

        x = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add(text);
        }

        System.out.println("Differences" + (System.currentTimeMillis() - x));
    }


}


