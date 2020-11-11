package exception_handling;

import java.io.IOException;

public class CustomException extends IOException {
    public static void ourCustomException(int members) throws IOException{
        if ( members >= 8){
            System.out.println("We can plan a trip to Manali in 2021");
        }else
            throw new IOException("Trip can not be made"); // Showing Custom Exception
    }

    public static void main(String[] args) {
        try {
            ourCustomException(7);
        }catch (Exception ex){
            System.out.println("Exception is"+ex);
        }
    }
}
