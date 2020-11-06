package fileIO.bufferedreader;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("file22.txt");
        BufferedReader brd = new BufferedReader(reader);
        int i;
        while ((i = brd.read()) != -1) {
            System.out.print((char) i);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter an integer");
        int j = br.read();
    }
}