package fileIO.filedescriptor;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileDescriptorDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file.txt");
        FileDescriptor fd = new FileDescriptor();
//        byte[] arr = new byte[] {66,73,66,72,85,66};
//        fos.write(66);
        fd = fos.getFD();
        fd.sync();
        fos.close();
    }
}
