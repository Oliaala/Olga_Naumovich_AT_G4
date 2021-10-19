package tasks.homework.basetask;

public class Pineapple {
    public int grade;
    public double heatCapacity;

    public Pineapple (int grade, double heatCapacity){
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }
  public void printPineappleDetails(){
        if (heatCapacity < 2140){
            System.out.println("в ветчине тепла запасается больше");
        } else {
            System.out.println("я ананас, теплоемкость которого больше, чем у ветчины");
        }
  }
}
