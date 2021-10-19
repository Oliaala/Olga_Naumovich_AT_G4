package tasks.classwork.day6;

public class GenericContainer <T>{

    private T[] array =(T[]) new Object[10];
    int freePlaceNumber = 0;

    public void add(T incoming) {

        array[freePlaceNumber++] = incoming;
        if (freePlaceNumber < array.length) {

        }

    }

    public T removeLast() {
        T ob = array[freePlaceNumber - 1];
        array[freePlaceNumber - 1] = null;
        freePlaceNumber--;
        return ob;
    }

    public boolean isEmpty() {
        return freePlaceNumber == 0;
    }

    public boolean isFull() {
        return freePlaceNumber == array.length;
    }

}
