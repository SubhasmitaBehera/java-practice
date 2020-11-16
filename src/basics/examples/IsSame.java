package basics.examples;

public class IsSame {
    public static void main(String[] args){
        IsSame obj = new IsSame();
        System.out.println(obj.getClass());
        int x = obj.isequal(2,2);
        if (x== 1){
            System.out.println("True");
        }
        else
            System.out.println("false");

    }
    public int isequal(int a, int b){
        if (a==b){
            return 1;
        }
        else
            return 0;
    }
}
//WAP to accept string from the user and check wheather the string is palindrom or not