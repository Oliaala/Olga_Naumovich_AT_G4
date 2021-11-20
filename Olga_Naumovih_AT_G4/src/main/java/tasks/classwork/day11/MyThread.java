package tasks.classwork.day11;

public class MyThread {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println());
     thread.start();
    }
}
