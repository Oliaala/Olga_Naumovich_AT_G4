package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.List;

public class Figures2 {

    public static void main(String[] args) {
        List<String> figures = new ArrayList<>();
        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");

        //+проитеррировать сп через фо-ич и отпечатать в файл через тире
        for (String x : figures) {
            System.out.println("-" + x + "-" + "");
        }
        System.out.println();

        //+посч ск фигур НЕ сод букву И и вывести число в консоль
        int count = 0;

        for (String x : figures) {
            if (!x.contains("и")) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println();

        //проитер-ть сп по инлексу и отпеч слова в конс через пробел
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i));
        }

        System.out.println();

        // встав на 3 позицию Треугольник
        figures.set(2, "Треугольник");

        //проит-ть сп через фо -ич и отпеч слова в консоль через пробел
        for (String x : figures) {
            System.out.println(x);
        }
    }
}