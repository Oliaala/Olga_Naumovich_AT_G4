package tasks.homework.basetask;

public class Mouse {
    private String name;
    private int age;

    public Mouse(int age, String name) {
        this.name = name;
        this.age = age;
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
    public void printMouseDetails(){
        System.out.println("я мышь, меня зовут " + name + " и мне " + age + " лет ");

    }
}
