package tasks.homework.bubbleTask.bubbles;

public class Bubble {
    private int volume;
    private String nameGas;

    public Bubble(int volume, String nameGas) {
        this.volume = volume;
        this.nameGas = nameGas;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getNameGas() {
        return nameGas;
    }

    public void setNameGas(String nameGas) {
        this.nameGas = nameGas;
    }

    public void printBubbleDetails() {
        System.out.println("я бабл, мой объем" + volume + " мой газовый состав " + nameGas + " я умею лопаться Cramp! ");

    }

}


