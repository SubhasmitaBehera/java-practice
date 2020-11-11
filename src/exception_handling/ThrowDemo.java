package exception_handling;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowDemo {

    static void validate(int age){

        if(age<18) {
            System.out.println("good");
//            int a  = 19/0;
        }
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){

        validate(13);
        try {
            throw new ArithmeticException();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }

}


