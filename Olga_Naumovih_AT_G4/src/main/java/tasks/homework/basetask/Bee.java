package tasks.homework.basetask;

public class Bee {
    private String gender;
    public long weight;

    public Bee(int weight, String gender) {
        this.gender = gender;
        this.weight = weight;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printBeeDetails() {
        System.out.println("я пчела, мой пол" + gender + "и мой вес " + weight + " грамма");

    }
}
