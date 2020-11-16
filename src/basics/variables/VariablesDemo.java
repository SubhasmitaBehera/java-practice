package basics.variables;


public class VariablesDemo {

    int var; // declaring variable
    static int var1; // declaring  variable

    static {
        // declaring & assigning value to variable

        String variable = "Bablu";  // scope of this variable inside the block only

        System.out.println("Variable inside static block : "+variable);

        var1 = 10;
        System.out.println("Assigning value to static variable inside static block : "+var1);

        // var = 20; // Not possible
    }

    {
        // declaring & assigning value to variable
        String anotherVariable = "Saroj"; // scope of the variable inside the block only

        System.out.println("Variable inside non-static block :"+anotherVariable);

        var1 = 20;
        System.out.println("Assigning value to static variable inside non static block : "+var1);

        var = 30;
        System.out.println("Assigning value to non-static variable inside non static block : "+var);
    }


    public static void main(String[] args) {
        var1 = 40;
        System.out.println("Assigning value to static variable inside static method : "+var1);

        VariablesDemo obj = new VariablesDemo(11,22);
        obj.m1();
        m2();
    }

    public VariablesDemo(int var,int var1) { // constructor can access both static and non static basics.variables
        this.var = var;
        this.var1 = var1;

        int resultOfAddition = var+var1;
        System.out.println(resultOfAddition);
    }

    void m1(){ // accessing both static and non static basics.variables
        System.out.println("Inside non static method");
        var = 100;
        var1 = 300;
        System.out.println(var+var1);
    }

    static void m2(){
        System.out.println("Inside static method");
        var1 = 500; // accessing only static basics.variables
        System.out.println(var1);
    }
}

