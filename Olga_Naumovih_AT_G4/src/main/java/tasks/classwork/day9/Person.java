package tasks.classwork.day9;

public class Person {

    public String name;
    public int age;
    public Sex sex;

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setSex(Sex sex) {
        this.sex = sex;
    }



    public Person(String name, int age, Sex sex){

        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public enum Sex{
        MAN, WOMEN
    }
}
