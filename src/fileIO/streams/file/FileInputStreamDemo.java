//package fileIO.streams.file;
//
////import arrays.Arrays;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class FileInputStreamDemo {
//    // read operation
//    // with binary - oriented file
//    public static void main(String[] args) throws IOException {
//        FileInputStream inputStream = new FileInputStream("file.txt");
//        int availableBytes = inputStream.available();
////        byte[] b = new byte[availableBytes];
//        System.out.println(availableBytes);
////        int j;
////        while ( (j = inputStream.read()) != -1){
////            System.out.print((char)j);
////        }
//        for (int i = 0; i < availableBytes; i++)
//        {
//            int j = inputStream.read(); // read() inside a loop, will automatically loop
//            System.out.print((char)j); // CH
//        }
//    }
//}