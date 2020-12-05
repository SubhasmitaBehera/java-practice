package fileIO.streamwriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args)throws IOException {
        OutputStream os = new FileOutputStream("file55.txt");
        OutputStreamWriter osr = new OutputStreamWriter(os);
        osr.write(77);
        osr.write("Hello this is some text");
        osr.close();
    }
}
