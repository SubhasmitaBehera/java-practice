package polymerphism;// Static - Compile time (Using Over loading)
////
//class Mul {
//
//        static int Multiply(int a, int b)
//        {
//            return a * b;
//        }
//
////        final static String Multi(int a, String b)
////        {
////            return a + b;
////        }
//
//        // Method with the same name but 2 double parameter
//        static double Multiply(double a, double b)
//        {
//            return a * b;
//        }
//
//        final void PrintNo(int a){
//            System.out.println(a);
//    }
//        final void PrintNo(double a){
//            System.out.println(a);
//    }
//    }
//
//public class polymerphism.PolymerphismDemo {
//        public static void main(String[] args)
//        {
//            Mul obj = new Mul();
//
//            System.out.println(obj.Multiply(2, 4));
//
//            System.out.println(obj.Multiply(5.5, 6.3));
//
//            obj.PrintNo(10);
//            obj.PrintNo(10.34);
//
//        }
//    }
// Dynamic - Run Time (Over Riding)

// Java program for Method overridding

class Parent {
    void Print()
    {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {

    void Print() { System.out.println("polymerphism.subclass1"); }
}

class subclass2 extends Parent {


    void Print()
    {
        System.out.println("polymerphism.subclass2");
    }
}

public class PolymerphismDemo {
    public static void main(String[] args)
    {
//        polymerphism.Parent a ;
//        a = new polymerphism.Parent();
//        a.Print();
//
//        a = new polymerphism.subclass1();
//        a.Print();

//        char x = 'x',y='y';
////        int x = 0 , y=0;
//        System.out.println((int) x + 1 == (int) y || (int)y- 1 > 5);

    }
}
