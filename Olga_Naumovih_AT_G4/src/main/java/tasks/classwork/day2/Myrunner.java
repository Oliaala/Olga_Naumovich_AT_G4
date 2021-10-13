package tasks.classwork.day2;

public class Myrunner {

    public static void main(String[] args) {

        Gluss glass = new Gluss(250, "белый");

        if(glass.isEmpty()){
            System.out.println("Стакан пустой");
        } else {
            System.out.println("Стакан не пустой");
        }

        System.out.println("Стакан " + glass.getColour());

        glass.setEffectiveVolume(200);
        System.out.println("В стакане " + glass.getEffectiveVolume() + " мл воды");
        System.out.println("Объем стакана " + glass.getFullVolume() + " мл воды");
        System.out.println("Цвет стакана " + glass.getColour());

        if(glass.isEmpty()){
            System.out.println("Стакан пустой");
        } else {
            System.out.println("Стакан не пустой");
        }
    }

}
