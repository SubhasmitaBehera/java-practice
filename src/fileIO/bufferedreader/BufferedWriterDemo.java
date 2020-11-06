package fileIO.bufferedreader;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args)throws IOException {
        Writer writer = new FileWriter("file22.txt");
        BufferedWriter bos = new BufferedWriter(writer);
        bos.write(67);
        bos.write(" this is a string ..");
        System.out.println("Success...");
        bos.flush();
        bos.close();
    }
}