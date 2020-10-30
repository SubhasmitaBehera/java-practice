package fileIO.streams.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    // read operation
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"));
        int availableCapacity = bis.available();
        System.out.println(availableCapacity);
        for (int i = 0; i < availableCapacity; i++) {
            int j = bis.read();
            System.out.print((char)j);
        }
        System.out.println();
        System.out.println(bis.markSupported());
        bis.mark(11);
        bis.reset();
        for (int i = 0; i < 11; i++) {
            int j = bis.read();
            System.out.print((char)j);
        }
    }
}