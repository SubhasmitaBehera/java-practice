package oops.inheritance;


class A
{
    public void print_geek1()
    {
        System.out.println("Geeks");
    }
}

class B extends A
{


    public void print_for()
    {

        System.out.println("for");
    }
}

class C extends B
{

    //    public void print_for()
//    {
//
//        System.out.println("for");
//    }
    public void print_geek()
    {
        super.print_geek1();
        System.out.println("Geeks1");
    }
}

// Drived class
public class Multilevel_Inheritance
{
    public static void main(String[] args)
    {
        C g = new C();
        g.print_geek();
        g.print_for();
        g.print_geek();
        B t = new B();
        t.print_geek1();
    }
}

