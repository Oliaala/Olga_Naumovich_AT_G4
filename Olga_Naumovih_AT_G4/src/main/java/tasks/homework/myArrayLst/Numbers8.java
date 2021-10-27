package tasks.homework.myArrayLst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers8 {

    public static void main(String[] args) {

        Integer[] a = {3342, 34, 79, 23426, 68, 1324, 55, 7699};
        List<Integer> intList = Arrays.asList(a);

 //+проит-ть сп через фо ич и отпеч числа в консоль новой строки
        for (Integer x : a) {
            System.out.println("\n" + x + "\n");
        }
        System.out.println();

//+проит-ть сп через фо ич и отпес числа в консоль через пробел
        for (Integer x : a) {
            System.out.println(" " + x + " ");
        }
        System.out.println();

 //+Посч сумму всех чисел и вывести рез в консоль
        int N = 3342;
        int N2 = 34;
        int N3 = 79;
        int N4 = 23426;
        int N5 = 68;
        int N6 = 1324;
        int N7 = 55;
        int N8 = 7699;
        int sum = N + N2 + N3 + N4 + N5 + N6 + N7 + N8;
        System.out.println("the summation of all numbers  is " + sum);

        System.out.println();

 //+Отсортировать сп по возрастанию

        /* ArrayList before the sorting*/
        System.out.println("Before Sorting:");
        for(int counter: intList){
            System.out.println(counter);
        }

        /* Sorting of arraylist using Collections.sort*/
        Collections.sort(intList);

        /* ArrayList after sorting*/
        System.out.println("After Sorting:");
        for(int counter: intList){
            System.out.println(counter);
        }
            System.out.println();

 //-проит-ть сп по индексу и отпеч числа в консоль через пробел
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        System.out.println();

//+развернуть сп в обратном порядке
        System.out.println("Before Sorting:");
        for(Integer str: intList){
            System.out.println(str);
        }
        /* Sorting in decreasing order*/
        Collections.sort(intList, Collections.reverseOrder());
        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for(Integer str: intList){
            System.out.println(str);

            System.out.println();



        }
    }
}