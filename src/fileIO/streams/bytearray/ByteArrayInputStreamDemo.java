//package fileIO.streams.bytearray;
//
//import java.io.ByteArrayInputStream;
//
//public class ByteArrayInputStreamDemo {
//    public static void main(String[] args) {
//        // -128 to 127
//        byte[] arr = {-128,34,127,22,67,75};
//
//        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
//        for (int i = 0; i < arr.length; i++){
//            int j = bais.read();
//            System.out.print((char)j);
//        }
//    }
//}