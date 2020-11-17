package array;

import java.util.Scanner;

public class ThreeD_ArrayMain {
    public static void main(String[] args) {

    int i, j, k;
        int even = 0,odd = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of Array you want :- ");
        int array = sc.nextInt();

        System.out.print("Enter the no of row you want :- ");
        int row = sc.nextInt();

        System.out.print("Enter the no of column you want :- ");
        int col = sc.nextInt();

        int[][][] arr_3D = new int[10][20][30];

        for (i = 0; i < array; i++)
            for (j = 0; j < row; j++)
                for (k = 0; k < col; k++) {
                    System.out.print(" enter the value for arr[" + i + "][" + j + "][" + k + "] = :  ");
                    arr_3D[i][j][k] = sc.nextInt();
                }

        for (i = 0; i < array; i++) {
            for (j = 0; j < row; j++) {
                for (k = 0; k < col; k++) {
                    if (arr_3D[i][j][k] % 2 == 0)
                        even++;
                    else
                        odd++;
                    System.out.print(arr_3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of Even Numbers : " + even);
        System.out.println("Total no of odd Numbers : " + odd);


    }
}
