package tasks.homework.basetask;

public class TrainMethodPrimitiveRunner {
    public static void main(String[] args){
    TrainMethodsPrimitive digtP = new TrainMethodsPrimitive();
    digtP.printInt();
    digtP.printLong();
        digtP.printChar();
        digtP.printDouble();
        digtP.printShort((short) 11);
        digtP.printByte((byte)-222);
        digtP.printBoolean(Boolean.TRUE);

    }
}
