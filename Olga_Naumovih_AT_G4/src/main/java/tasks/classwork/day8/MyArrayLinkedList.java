package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayLinkedList {

    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
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