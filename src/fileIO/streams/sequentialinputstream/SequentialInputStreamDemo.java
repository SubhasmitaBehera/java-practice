package fileIO.streams.sequentialinputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequentialInputStreamDemo {
    // read operation only, no write operation for this class
    // to read multiple streams, in order/ in sequence
    public static void main(String[] args) throws IOException {
        FileInputStream fos1 = new FileInputStream("file.txt");
        FileInputStream fos2 = new FileInputStream("file2.txt");

        SequenceInputStream sis = new SequenceInputStream(fos1,fos2);
        int available = fos1.available();
        int available1 = fos2.available();
        System.out.println(available);

        int j;
//        while ((j = sis.read())!= -1)
//        {
//            System.out.print((char)j);
//        }

//        for (int i = 0; (j = sis.read()) != -1; i++ ){
//            System.out.print((char)j);
//        }

        for (int i = 0; i < available+available1; i++ ){
            j = sis.read();
            System.out.print((char)j);
        }
    }
}