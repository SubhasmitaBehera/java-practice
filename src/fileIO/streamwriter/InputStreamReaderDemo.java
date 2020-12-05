package fileIO.streamwriter;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter any input : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);

        InputStream is = new FileInputStream("file55.txt");
        InputStreamReader isr1 = new InputStreamReader(is);

        int j;
        while ((j = isr1.read()) != -1)
            System.out.print((char) j);


    }
}
