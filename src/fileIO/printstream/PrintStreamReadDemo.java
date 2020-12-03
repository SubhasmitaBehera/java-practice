package fileIO.printstream;

import java.io.FileInputStream;
import java.io.IOException;

public class PrintStreamReadDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("File33.txt");
        int i;
        while ((i = fileInputStream.read()) != -1)
        {
            System.out.print((char) i);
        }
    }
}
