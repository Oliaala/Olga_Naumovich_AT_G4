package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.List;

public class Cities3 {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String x : cities) {
            System.out.println(x);
        }
        System.out.println();

        //-посчитать сумму всех букв во всех словах и вывести в консоль цифру
        int count = 0;

        for (String x : cities) {
            if (x.contains(x)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println();

        //+проинтерировать сп по индексу и отпеч слова в консоль через пробел
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
    }
}