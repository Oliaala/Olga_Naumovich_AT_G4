package tasks.classwork.basetask;

public class Bee {
    private String gender;
    public long weight;

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

    public Bee(int weight, String gender) {
        this.gender = gender;
        this.weight = weight;
    }


    public void printBeeDetails() {

    }
}
