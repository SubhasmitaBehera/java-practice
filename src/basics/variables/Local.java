package basics.variables;

public class Local {

    {
        int a;
        a = 10;
        System.out.println(a);

        int b ;

//        System.out.println(b); // local variable must be initialised
    }

    public static void main(String[] args) {
        Local obj  = new Local();
        obj.sum(10,20);
    }

    public void sum(int x,int y){
        int result = x+y;
        System.out.println("Sum result "+ result);
    }
}
