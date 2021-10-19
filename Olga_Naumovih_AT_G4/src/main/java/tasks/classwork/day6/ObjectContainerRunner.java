package tasks.classwork.day6;

public class ObjectContainerRunner {

    static ObjectContainer container = new ObjectContainer();

    public static void main(String[] args) {
        while (!container.isFull()) {
            container.add(5);
            container.add("asdfh");

        }
        System.out.println(container + "asdfh");
        while (!container.isEmpty()) {
            System.out.println(container.removeLast());

        }

    }


}
