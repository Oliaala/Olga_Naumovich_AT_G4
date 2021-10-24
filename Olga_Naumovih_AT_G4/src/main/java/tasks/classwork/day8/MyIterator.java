package tasks.classwork.day8;

import java.util.*;

public class MyIterator<myList> {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String text = "мама мыла раму мыла";
        String[] words = text.split(" ");
        for (String x : words) {
            mySet.add(x);
        }
        for (String x : mySet) {
            System.out.println(x);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    }
