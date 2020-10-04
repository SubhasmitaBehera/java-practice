package inheritance;

abstract class MyClass{
    abstract void calculate(double X);
    void show(){
        System.out.println("This is a normal statement in a abstract class");
    }
}

class One extends MyClass {
    void calculate(double X){
        System.out.println("Square is :- "+X*X);
    }
}

class Two extends MyClass {
    void calculate(double X){
        System.out.println("Cube is :- "+X*X*X);
    }
}


public class AbsDemo1 {
    public static void main(String[] args) {
        One ob1 = new One();
        Two ob2 = new Two();
        ob1.calculate(12);
        ob1.show();
        ob2.calculate(11);
        ob2.show();
    }
}
