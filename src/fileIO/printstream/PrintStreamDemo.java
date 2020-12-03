package fileIO.printstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileWriter = new FileOutputStream("File33.txt");
        // takes output stream as parameter
        PrintStream obj = new PrintStream(fileWriter);
        obj.println(2020);
        obj.println("is a devil");
        obj.println(true);
        obj.print(new char[] {'a','b','c'});
        obj.println(fileWriter);
        obj.println(obj);
        obj.print(2021);
        obj.print(" might be good");
        obj.close();
    }
}
