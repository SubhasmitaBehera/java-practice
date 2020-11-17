package fileIO.data;

//import java.io.DataOutputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.*;

public class DataOutputStreamDemo {
    //write primitive java data types - int char float
    //to the output stream in a machine-independent way

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file5.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeDouble(1.1);
        dos.writeInt(15);
        dos.writeBoolean(true);
        dos.writeChar('z');
//        dos.writeBytes("subha");
//        dos.writeChars("smita");
        dos.writeUTF("This is DataOutputStream");
        dos.flush();
        System.out.println("Success....");

    }
}
