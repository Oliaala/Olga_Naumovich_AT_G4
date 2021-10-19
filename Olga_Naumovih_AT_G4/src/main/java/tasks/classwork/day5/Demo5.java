package tasks.classwork.day5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5<text> {
    public Demo5() throws ParseException {
    }

    public static void main(String[] args) throws ParseException {
        float x = 0.3f + 0.4f;
        System.out.println(x);

        int y = Integer.parseInt("23");
        System.out.println(y);


        long t1 = System.currentTimeMillis();
        int n = 100_000;
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            s.append("*");

        }
        System.out.println(s);
        System.out.println(System.currentTimeMillis() - t1);


        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        Date date = dateFormat.parse("04.06.2012");
        String text = dateFormat.format(new Date());

        System.out.println(text);

    }
}


