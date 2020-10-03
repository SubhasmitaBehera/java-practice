package array;

public class ArrayMain {
    public static void main(String[] args) {
        String str[] = {"subhasmita" , "babismita" , "amit"};
        int len = str.length;
        System.out.println("Array length is = "+len);
        System.out.print("{");
        for (int i = 0 ; i < len ; i++){
            System.out.print(str[i] +" ");
        }
        System.out.println("}");
        System.out.println(str[1]);
    }
}
