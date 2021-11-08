package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Сars4 {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Эллипс");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        // проит-ть сп через фо ич и отпечатать слова в файл карс через с новой строки в кавычках
        // найти и удалить из набора авто, в названии которых больше 4 букв


        // прот-ть сп через фо ич и отпечатать сл в консоль через пробел
        for (String x : cars) {
            System.out.println(x);
        }
    }
}