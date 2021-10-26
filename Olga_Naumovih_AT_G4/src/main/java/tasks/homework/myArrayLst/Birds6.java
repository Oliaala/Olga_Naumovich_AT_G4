package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.List;

public class Birds6 {

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("Чайка");
        birds.add("Дрозд");
        birds.add("Бусел");
        birds.add("Голубь");
        birds.add("Воробей");
        birds.add("Цапля");

        for (String x : birds) {
            System.out.println("--" + x + "--" + "");
        }
        System.out.println();

        //посч ск птиц сод > 1гласной и вывести число в консоль

        //Проит-ть сп по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < birds.size(); i++) {
            System.out.println(birds.get(i));
        }
        System.out.println();

        //заменить 3 элемент списка на Синица
        birds.set(2, "Синица");
        System.out.println();

        //проит-ть сп через фо ич и отпеч-ть слова в консоль через пробел
        for (String x : birds) {
            System.out.println(x);
        }

    }
}
