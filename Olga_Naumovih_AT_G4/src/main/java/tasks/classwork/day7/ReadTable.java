package tasks.classwork.day7;

import java.io.*;

public class ReadTable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Table table = (Table) ois.readObject();

        ois.close();
        System.out.println(table.toString());
    }
}

