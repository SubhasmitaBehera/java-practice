package oops.objects;

// Java program to illustrate different ways of calling a method

class Test {
    public static int i = 0;

    Test() {
        i++;  // 1
    }

    public static int get() {
        return i;
    }

    // Instance method calling object directly
    // that is created inside objectorientedprogramming.another class 'objectorientedprogramming.Oop4_Methods'.
    // Can also be called by object directly created in the same class
    // and from objectorientedprogramming.another method defined in the same class
    // and return integer value as return type is int.

    public int m1() {
        System.out.println("Inside the method m1 by object of object oriented programming.Oop4_Methods class");

        // calling m2() method within the same class.
        this.m2();

        // statements to be executed if any
        return 1;
    }

    public void m2() {
        System.out.println("In method m2 came from method m1");
    }
}

public class Oop4_Methods {
    public static void main(String[] args) {
        // Creating an instance of the class
        Test obj = new Test();

        // Calling the m1() method by the object created in above step.
        int i = obj.m1();
        System.out.println("Control returned after method m1 :" + i); // 1

        // Call m2() method
        // obj.m2();
        int no_of_objects = Test.get(); // Static method can be called directly and should not be called using objects of the class

        System.out.print("No of instances created till now : ");
        System.out.println(no_of_objects); // 1
    }
}

