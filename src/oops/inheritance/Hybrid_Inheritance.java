package oops.inheritance;

//                 interface Parent

// interface Child 1                interface inheritance.Child2         // Hierarchical

//                   Child 3                                 // Multiple Inheritance


interface Parentt{
    void show();
    public static void show1(){
        System.out.println(" Hi1");
    }
}

interface Child1 extends Parentt {
    public static void show1(){
        System.out.println(" Hi2");
    }
}

interface Child2 extends Parentt{

    public static void show1(){
        System.out.println(" Hi3");
    }
    void display();  //
}

class Child3 implements Child1,Child2 {

    public static void show1(){
        System.out.println(" Hi3");
    }

    public void show() {
        System.out.println("Hi4");
    }

    public void display(){
        System.out.println("Hi6");
    }

//    public static void show3() {
//        System.out.println(" Hi5");
//    }
}

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Child3 ob = new Child3() ;
        ob.show();                  // Hi4
        Child3.show1();            // Hi2
//        inheritance.Child3.show3();
        ob.display();                          // Hi5
    }
}

