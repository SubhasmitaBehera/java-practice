package fileIO.filestream;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    // for write operation
    // Binary - oriented , character- oriented - 2 types file format in java
    // music, image, video, text
    // FileOutputStreamDemo class is used to do File oriented operations
    // to write binary- oriented data to the file .
    // we can also write character oriented data using FileOutputStreamDemo ,
    // but it is better to use FileWriter(will be discussed later) class while doing so.
    public static void main(String[] args) {
        try {
//            FileOutputStream fos = new FileOutputStream("file.txt"); // file create
            FileOutputStream fos = new FileOutputStream("D:\\New\\desk.txt"); // we can use path to create files also

            fos.write(67);             // integer, -1 to 255(ASCII) - "C"
            String s = "Hello World";     // 0 - 10
            byte[] arr = s.getBytes();
            fos.write(arr);               // byte[] - byte array
            fos.write(arr, 2, 9); // byte[] with conditions - last index is exclusive
            fos.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
