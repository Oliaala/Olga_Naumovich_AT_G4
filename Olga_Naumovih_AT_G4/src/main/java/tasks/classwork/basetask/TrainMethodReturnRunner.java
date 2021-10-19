package tasks.classwork.basetask;

public class TrainMethodReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn returnValue = new TrainMethodsReturn();
        System.out.println(("метод returnNewInt вернул" + returnValue.returnNewInt(3)));
        System.out.println(("метод returnNewLong вернул" + returnValue.returnNewLong(123456789)));
        System.out.println(("метод returnNewChar вернул" + returnValue.returnNewLong('%')));
        System.out.println(("метод returnNewFloat вернул" + returnValue.returnNewFloat(10.66f)));
        System.out.println(("метод returnNewDouble вернул" + returnValue.returnNewFloat(10.88f)));
        System.out.println(("метод returnNewShort вернул" + returnValue.returnNewShort((short) 12)));
        System.out.println(("метод returnNewByte вернул" + returnValue.returnNewByte((byte) -222)));
        System.out.println(("метод returnNewBoolean вернул" + returnValue.returnNewBoolean(true)));

    }
}
