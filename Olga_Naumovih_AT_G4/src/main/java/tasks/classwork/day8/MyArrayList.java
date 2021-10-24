package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static <split> void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String text = "мама мыла раму мыла";
        String[] words = text.split(" ");
        for (String x : words) {
            myList.add(x);

        }
        for (String x : myList){
            System.out.println(x);
        }
        for(int i =0; i< myList.size(); i++ ){
            System.out.println(myList.get(i));

        }
    }
}
