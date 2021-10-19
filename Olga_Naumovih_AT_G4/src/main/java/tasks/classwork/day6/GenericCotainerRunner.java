package tasks.classwork.day6;

public class GenericCotainerRunner {

    static GenericContainer<Integer> container = new GenericContainer<>();

    public static void main(String[] args) {
        while (!container.isFull()) {
            container.add(5);

        }
        System.out.println(container + "asdfh");
        while (!container.isEmpty()) {

            System.out.println(container.removeLast());

        }

    }

}
