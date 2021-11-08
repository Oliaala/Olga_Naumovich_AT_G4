package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.List;

public class Elements7 {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String x : elements) {
            System.out.println(x);
        }
        System.out.println();

        //-посч ск-о названий элементов сост более, чем из одного слова и вывести число в консоль

        //+ проит-ть по индексу и вывести в конс через проб
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }
        System.out.println();

        //+ на 4 позиц добавить Spinner
        elements.set(3, "Spinner");


        //+удалить 2 элемент списка
        elements.remove(1);


        // +проит-ть сп через фо ич и отпеч сл в консоль через пробел
        for (String x : elements) {
            System.out.println(x);
        }
}
}
