package fileIO.streams.bytearray;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    // to write same type data to multiple files
    public static void main(String[] args) throws IOException {
        FileOutputStream fos1 = new FileOutputStream("file2.txt");
        FileOutputStream fos2 = new FileOutputStream("file3.txt");
        FileOutputStream fos3 = new FileOutputStream("file4.txt");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String s = "This is a string added to the file o/p stream";
        byte[] arr = s.getBytes();

        baos.write(arr);
        baos.writeTo(fos1);
        baos.writeTo(fos2);
        baos.writeTo(fos3);
        System.out.println("success..");
    }
}