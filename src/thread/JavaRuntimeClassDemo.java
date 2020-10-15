package thread;

import java.io.IOException;

public class JavaRuntimeClassDemo {  //Runtime
    public static void main(String[] args) throws IOException {
//        Runtime obj = new Runtime();  // can not create instance/object using new keyword here.
        System.out.println("Available Processors : " +Runtime.getRuntime().availableProcessors());
        System.out.println("Free memory: " +Runtime.getRuntime().freeMemory());
        System.out.println("Total memory: " +Runtime.getRuntime().totalMemory());

        Runtime.getRuntime().exec("shutdown -r -t 10");  //It will shutdown the system.
        for (int i=0; i<10000; i++){
            new JavaRuntimeClassDemo();
        }
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());
        System.out.println("Total memory: " +Runtime.getRuntime().totalMemory());
        Runtime.getRuntime().exec("notepad");
//        Runtime.getRuntime().exit(0);
        System.out.println("Program");
        System.gc();
        System.out.println("Free memory: " +Runtime.getRuntime().freeMemory());

    }
}
