package fileIO.printwrite;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args)throws IOException {

        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.write("string added..",2,9);
        printWriter.write(75);

        PrintWriter printWriter1 = new PrintWriter("fill44.txt");
        printWriter1.write(" another string");
        printWriter.close();
        printWriter1.close();
    }
}
