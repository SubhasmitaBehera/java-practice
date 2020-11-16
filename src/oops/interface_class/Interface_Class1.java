package oops.interface_class;

interface Myclass{
    static void calculate(double x){
        System.out.println("Hi");

    }
    void calculate1(double x);

}

class child1 implements Myclass {
    public void calculate1(double x){
        System.out.println("Square is :- "+x*x);
    }
    void calculate(double x){
        System.out.println(x);
    }

}

class child2 implements Myclass {
    void calculate(double x){
        System.out.println(x);
    }
    public void calculate1(double x){
        System.out.println("Cube is :- "+x*x*x);
    }
}

public class Interface_Class1 {
    public static void main(String[] args) {
        child1 ob1 = new child1();
        child2 ob2 = new child2();
        ob1.calculate(11);
        ob1.calculate1(11);
        ob2.calculate(10);
        ob2.calculate1(10);
        Myclass.calculate(5);

    }
}
