package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.List;

public class Сountries5 {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        //+ фо ич, отпеч в консоль через запятую с пробелом
        for (String x : countries) {
            System.out.println("," + x + "," + "");
        }
        System.out.println();

        //-посч ск-ко стран, в названии кот меньше 7 букв и вывести число в консоль
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
        System.out.println();

        //+ проит-ть сп по индексу и отпеч слова в консоль с новой строчки
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}