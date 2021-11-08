package tasks.homework.myArrayLst;

import java.util.Arrays;
import java.util.List;

public class Doubles9 {

    public static void main(String[] args) {

        double[] doubles = {33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9};
        List<double[]> intList =  Arrays.asList(doubles);

 //+проит-ть сп через фо ич и отпис числа в консоль через пробел
        for (double x : doubles) {
            System.out.println(" " + x + " ");
        }
        System.out.println();

//-посч произведение всех чисел и вывести в конс
        double N = 33.42;
        double N2 = 34.3;
        double N3 = 0.79;
        double N4 = 2.3426;
        double N5 = 6.8;
        double N6 = 13.24;
        double N7 = 5.5;
        double N8 = 769.9;
        double sum = N * N2 * N3 * N4 * N5 * N6 * N7 * N8;
        System.out.println("the summation of all numbers  is " + sum);

        System.out.println();
        //найти сумму и вывевсти

        //проит-ть сп по инд и целые части через пробел

    }
}