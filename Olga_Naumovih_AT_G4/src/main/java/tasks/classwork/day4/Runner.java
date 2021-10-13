package tasks.classwork.day4;

public class Runner {
    public static void main(String[] args) {
        new Person().speak("lol");
        new Dog().speak("af");
        new Cat().speak("mey");

        makePersonSpeak(new Person());
        makeCatSpeak(new Cat());
        makeDogSpeak(new Dog());
        Men men = new Men();
        men.speak("ghue");
    }

    public static void makePersonSpeak(Person person) {
        person.speak("summer");
    }

    public static void makeDogSpeak(Dog dog) {
        dog.speak("meet");
    }

    public static void makeCatSpeak(Cat cat) {
        cat.speak("milk");
    }

}
