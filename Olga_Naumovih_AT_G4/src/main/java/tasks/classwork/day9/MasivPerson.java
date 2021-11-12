package tasks.classwork.day9;

import java.util.Arrays;
import java.util.List;

public class MasivPerson {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Рома Петрович", 72, Person.Sex.MAN));

        int couter = 0;
        for (Person person : people) {
            if ((person.getSex().equals(Person.Sex.WOMEN) && person.getAge() > 18 && person.getAge() < 55) ||
                    (person.getSex().equals(Person.Sex.MAN) && person.getAge() > 18 && person.getAge() < 60)) {

                couter++;
            }
        }
        System.out.println(couter);

        long countP = people.stream().filter(p -> p.getAge() > 18)
                .filter(person -> (person.getSex().equals(Person.Sex.WOMEN) && person.getAge() > 18 && person.getAge() < 55) ||
                        (person.getSex().equals(Person.Sex.MAN) && person.getAge() > 18 && person.getAge() < 60)).count();

        System.out.println(countP);


    }

}