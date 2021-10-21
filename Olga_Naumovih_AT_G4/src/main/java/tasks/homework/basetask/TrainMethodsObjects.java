package tasks.homework.basetask;

public class TrainMethodsObjects {
    public static void main(String[] args) {


        Mouse mouse = new Mouse(5, "Mikk");
        new Mouse(5, "Mikk").printMouseDetails();


        Bee bee = new Bee(3, "женский" );
        new Bee( 3,  "женский").printBeeDetails();

        Obstacle obstacle = new Obstacle(" высокое", "важность" );
        new Obstacle(" высокое",  "важность").printObstacleDetails();

        Pineapple pineapple = new Pineapple(1, 2000);
        new Pineapple( 1,2000);

    }

}
