package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.List;

public class Butterflies1 {

    //создать пустой список стрингов батерфляй через нью эрэйлист

    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        //+проинт сп через фо-ич и отпеч сл в консоль в кавычках
        for (String x : butterflies) {
            System.out.println("\"" + x + "\"" + "");
        }
        System.out.println();

        //+посчитать сколько бабочек содержат букву о, вывести в консоль число

        int count = 0;

        for (String x : butterflies) {
            if (x.contains("o")) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println();

        //+проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.println(butterflies.get(i));
        }

        System.out.println();

        //-проитерировать список через фо-ич и отпечатать слова в консоль через перенос строки
        for (String x : butterflies) {
            System.out.println(x);
        }
    }
}