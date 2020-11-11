package exception_handling;

import java.io.IOException;

public class ThrowsDemo2 {
    // ************Program showing Throws handling the Exception *************//
    // We are handling the exception .
        void m() throws IOException {
            System.out.println("hi");
            throw new IOException("Device ");
        }
        void n() throws IOException {
            System.out.println("hi");
            m();
        }
        void p() {
            try {
                n();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        public static void main(String args[]) {
            ThrowsDemo2 obj=new ThrowsDemo2();
            obj.p();
            System.out.println("normal flow...");
        }
}
