package array;

public class ArrayDemo {
    public static void main (String[] args) {
        int j=0;
        int arr[] = new int[10];

//        int a =10;

        for (int i = 1 ; i< 10 ; i++) {
            if ((10 % i) == 0);
            {
                arr[j] =i ;
                j++ ;
            }
        }

        for (int k = 0 ; k< arr.length ; k++)
        {
            System.out.println(arr[k]);
        }

    }
}
