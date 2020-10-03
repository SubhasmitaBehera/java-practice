package array;

import java.util.Scanner;

public class TwoD_ArrayMain {
    public static void main(String[] args) {
        int i,j=0 ;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows you want:- ");
        int row=sc.nextInt();
        System.out.print("Enter the number of columns you want:- ");
        int col=sc.nextInt();
        int arr[][]=new int[11][11];

        for (i=0 ; i<row ; i++){
            for(j=0 ; j<col ; j++){
                System.out.print("Enter the element of arr ["+i+"]["+j+"] :-");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The final 2D array is :-");
        for (i=0 ; i<row ; i++){
            for(j=0 ; j<col ; j++){
                System.out.print("  "+arr[i][j] + "   ");
            }
            System.out.println();
            System.out.println();
            }


    }
}
