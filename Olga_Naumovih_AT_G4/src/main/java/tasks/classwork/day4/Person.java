package tasks.classwork.day4;

public class Person implements Speakable {
    public void speak(String phrase) {
        System.out.println(phrase);

    }

    @Override
    public void shout(String phrase) {
        System.out.println(phrase);
    }

}
