package tasks.classwork.day2;

public class Gluss {

    private int fullVolume;
    private int effectiveVolume;
        private String colour;
    private boolean isEmpty = true;

    public Gluss(int fullVolume, String colour){
        this.fullVolume = fullVolume;
        this.colour = colour;



    }

    public int getFullVolume() {
        return fullVolume;
    }



    public int getEffectiveVolume() {
        return effectiveVolume;
    }

    public void setEffectiveVolume(int effectiveVolume) {
        this.effectiveVolume = effectiveVolume;
        if(effectiveVolume > 0){
            this.isEmpty = false;
        }
    }



    public String getColour() {
        return colour;
    }



    public boolean isEmpty() {
        return isEmpty;
    }


}
