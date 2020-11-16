package oops.constructor;



public class ConstructorMain {

    public static void main(String[] args) {
        ConstructorDemo constructors = new ConstructorDemo();
        ConstructorDemo constructors1 = new ConstructorDemo(11,22);
        ConstructorDemo constructors2 = new ConstructorDemo(111);

        System.out.println("inside main function...");

        System.out.println("Values are : "+constructors.a+ " "+constructors.b);
        System.out.println("Values are : "+constructors1.a+ " "+constructors1.b);
        System.out.println("Values are : "+constructors2.a+ " "+constructors2.b);
    }





}

