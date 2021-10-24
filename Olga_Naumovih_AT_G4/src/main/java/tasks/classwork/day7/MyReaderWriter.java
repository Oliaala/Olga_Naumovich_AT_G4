package tasks.classwork.day7;

import java.io.*;

public class MyReaderWriter {
    public static void main(String[] args) throws IOException {
        //  read();
        write();
    }

    public static void read() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("Text"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();

    }


    public static void write() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("Text2"));
        out.write("мама мыла раму");
        out.newLine();
        out.write("брат мыл раму");
        out.close();

    }



}
