package fileIO.streams.stream;

import java.io.IOException;
import java.util.Scanner;

public class StreamsDemo {
    public static void main(String[] args) throws IOException {
        // Streams in java by default
        //System.out
        //System.in
        //System.err
        System.out.println("output printed here");
        System.err.println("error printed here");
        System.out.println("Enter message : ");

        char i = (char) System.in.read();
        System.out.println((int)i);

//        int j =System.in.read(); // reads 1st character the input as (ASCII) character
//        System.out.println((char) j);
    }
}