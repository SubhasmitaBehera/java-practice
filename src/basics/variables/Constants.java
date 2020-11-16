package basics.variables;

public class Constants {
    public static final String myName ;
    public final int dateOfBirthYear ;

    static {
        myName = "Saroj Kumar";
        System.out.println(myName);

        // myName = "Bablu"; not possible to modify final(constant variable) also called class constant
    }

    {
        dateOfBirthYear = 1997;
        System.out.println(dateOfBirthYear);
        // dateOfBirthYear = 1998; not possible to modify final(constant) variable also called instance constant
    }

    public static void main(String[] args) {
        new Constants().sum();
    }
    public  static final int a = 10;
    public  static final int b = 10;

    public void sum(){
        int res = a + b;
        System.out.println(res);
    }
}
