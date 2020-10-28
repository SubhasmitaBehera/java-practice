//package fileIO.streams.buffer;
//
//import java.io.BufferedOutputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class BufferedOutputStreamDemo {
//    public static void main(String[] args) throws IOException {
////        FileOutputStream fos = new FileOutputStream("text.txt");
////        BufferedOutputStream bos = new BufferedOutputStream(fos); // adding the file to buffer stream for faster
////        // operation
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text.txt"));
//        byte[] arr = new byte[] {127,0,3,2,3,4};
//        String s = "This is a string";
//        byte[] arr1 = s.getBytes();
//        bos.write(arr);
//        bos.write(arr1);
//        bos.flush(); // it forces the stream of data to be written in the desired file - here "text.txt"
//        System.out.println("successfully written...");
////        for (byte i = -128; i < 127; i++)
////        {
////            System.out.print(" "+(char)i);
////        }
//
////        byte a = 127;
////        System.out.println((char)a);
////        byte b = 0;
////        System.out.println((char)b);
////        byte c = 3;
////        System.out.println((char)c);
////        byte d = 2;
////        System.out.println((char)d);
//    }
//}
