import java.util.Scanner;

public class GCD {
    public static void main(String args[]){

        System.out.print("Enter two numbers to find GCD :- ");
        Scanner Obj = new Scanner(System.in);
        int first_num = Obj.nextInt();
        int second_num = Obj.nextInt();
        int gcd = findGCD(first_num,second_num);
        System.out.println("GCD =" + gcd);
    }
    public static int findGCD(int first_num,int second_num){
        while (second_num !=0){
            if(first_num > second_num){
                first_num = first_num - second_num;
            }
            else {
                second_num = second_num - first_num ;
            }
        }
        return first_num;
    }
}
