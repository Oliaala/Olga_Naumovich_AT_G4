package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.List;

public class Noodles10 {

    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        //+проинт сп через фо-ич и отпеч сл в консоль через тире
        for (String x : noodles) {
            System.out.println("-" + x + "-" );
        }
        System.out.println();

        //+заменить в каждом слове а на о
        String Str = new String("Hakka Ramen Hibachi Schezwan");
        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.replace('a', 'o'));

        System.out.println();

        //+проит-ть сп по индексу и отпеч сл в консоль через пробел
        for (int i = 0; i < noodles.size(); i++) {
            System.out.println(noodles.get(i));
        }
    }
}