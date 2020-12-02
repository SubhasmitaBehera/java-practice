package fileIO.example;

import java.io.*;

public class Char_and_byte_Streams {
    // Java Program illustrating the Byte Stream to copy
    // contents of inheritance.one file[Music]
    // to objectorientedprogramming.another file.

//        public static void main(String[] args) throws IOException
//        {
//            sourceStream = null;
//            targetStream = null;

//            String obj = new String();

//            FileInputStream abc = new FileInputStream("song.mp3");   // Read
//            FileOutputStreamDemo abcd = new FileOutputStreamDemo("file.mp3");  // Write
//
//            // Reading source file and writing content to target
//            // file byte by byte
//            int temp;
//            int num=0;
//            while ((temp = abc.read()) != -1) {
//                System.out.println(num);  // To see how many times a loop runs
//                abcd.write((byte) temp);
//                num++;
//            }


    // Java Program illustrating that we can read a file in
    // a human readable format using FileReader

    public static void main(String[] args) throws IOException {
////          FileReader sourceStream = null;
////          FileWriter sourceStream = null;

        FileReader a = new FileReader("text.txt");

        // Reading source file and writing content to
        // target file character by character.
        int temp;
        while ((temp = a.read()) != -1)
            System.out.print((char) temp);
    }
}

