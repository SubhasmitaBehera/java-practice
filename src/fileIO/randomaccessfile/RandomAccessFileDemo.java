package fileIO.randomaccessfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

//public class RandomAccessFileDemo {
//    public static void main(String[] args) throws IOException {
//        RandomAccessFile rs = new RandomAccessFile("file1.txt", "r");
//        int i;
//        while ((i = rs.read()) != -1)
//            System.out.print((char) i);
//
//        RandomAccessFile rs1 = new RandomAccessFile("file1.txt", "rw");
////        rs1.seek(100);
//        rs1.write(67);
//        int j = rs1.read();
//        System.out.println((char)j);
//    }
public class RandomAccessFileDemo {
    static final String FILEPATH ="myFile.TXT";
    public static void main(String[] args) {
        try {
            FileInputStream ins = new FileInputStream(FILEPATH);
            int size = ins.available();
            System.out.println(new String(readFromFile(FILEPATH, 0, size)));
            writeToFile(FILEPATH, "I love my country and my people", 31);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }
    private static void writeToFile(String filePath, String data, int position)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
