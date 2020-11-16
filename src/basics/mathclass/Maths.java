package basics.mathclass;

import java.util.Random;

public class Maths {
    public static void main(String[] args) {
        System.out.println(Math.max(2,65));
        System.out.println(Math.min(2,65));
        System.out.println(Math.abs(2.78));
        System.out.println(Math.abs(-2.78));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.ceil(-64.99));
        System.out.println(Math.floor(-64.56));

        double rand = Math.random();
        System.out.println((int)rand);

        int randomNum = (int)(Math.random() * 10 ) + 20;  // (Math.random*(ub-lb)) + lb
        System.out.println(randomNum);

//        Random random = new Random();
//        double a = (random.nextDouble() * 10) + 10;
//        System.out.println(a);
    }
}
