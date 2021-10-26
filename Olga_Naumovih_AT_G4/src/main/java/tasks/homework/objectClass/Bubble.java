package tasks.homework.objectClass;

import java.util.Objects;

public class Bubble {

    //все поля прайвит

    private int volume;
    private String name;

    //конструктор с инициализацией всех полей

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }
    //то стринг,хеш код, иквалс

    @Override
    public String toString() {
        return "Bubble{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bubble bubble = (Bubble) o;
        return volume == bubble.volume && Objects.equals(name, bubble.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, name);
    }

    //геттеры сеттеры


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
