package tasks.classwork.day7;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String incoming = scanner.nextLine();
            if(incoming.equals("привет")){
                break;
            }
            System.out.printf("just got '%s' text!", incoming);

        }
    }
}
