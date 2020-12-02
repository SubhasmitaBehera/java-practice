package fileIO.console;

import java.io.Console;
import java.lang.System;
// This program works fine with command prompt but not in IDEs
public class ConsoleDemo {
    public static void main(String args[]) {
        Console c = System.console();
        System.out.println("Enter password: ");
        char[] ch = c.readPassword(); // will not show the entered password to the user.
        String pass = String.valueOf(ch);  // converting char array into string
        System.out.println("Password is: " + pass);
    }
}
