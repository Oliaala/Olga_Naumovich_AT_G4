package tasks.homework.basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int num3) {
        int intNumber = (int) Math.pow(num3, 3);
        return intNumber;
    }

    public long returnNewLong(long longNum3) {
        long total = longNum3 - 4;
        return total;
    }

    public String returnNewChar(char charNum3) {
        String resultCharNum3 = "";
        for (int i = 0; i < 2; i++) {
            resultCharNum3 = resultCharNum3 + charNum3;
        }
        return resultCharNum3;
    }

    public float returnNewFloat(float floatNum3) {
        float resultNewFloat = floatNum3 / 2;
        return resultNewFloat;
        }
    public double returnNewDouble(double doubleNum3){
        final int i = 5;
        double resultNewDouble = doubleNum3 + (double) i;
        return resultNewDouble;
    }
    public short returnNewShort(short shortNum3){
        final int i = 1;
        int resultNewShort = (int) shortNum3 - 1;
        return (short) resultNewShort;
    }
    public int returnNewByte(byte byteNum3){
        int resultByteNum3 = (byteNum3 * 2);
        return resultByteNum3;
    }
    public boolean reyurnNewBoolean(boolean booleanValue){
        boolean t = true;
        boolean f = false;
        if (booleanValue == t){
            return f;}
        else{
            booleanValue = false;
            return t;}
        }

    public String returnNewBoolean(boolean b) {


        return null;
    }

}




