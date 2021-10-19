package tasks.classwork.day6;

import javax.swing.*;

public class ObjectContainer {
    Object[] array = new Object[10];
    int freePlaceNumber = 0;

    public void add(Object incoming) {

        array[freePlaceNumber++] = incoming;
        if (freePlaceNumber < array.length) {

        }

    }

    public Object removeLast() {
        Object ob = array[freePlaceNumber - 1];
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
