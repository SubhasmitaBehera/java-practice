package inheritance;

class A {
    void m1(){
        System.out.println("This is inheritance.A's m1...");
    }
}

class B extends A {
    void m1(){
        System.out.println("This is inheritance.B's m1...");
    }
}

class C extends A {
    void m1(){
        System.out.println("This is inheritance.C's m1...");
    }
}

class DynamicMethodDispatch {
    public static void main (String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        A d = new C();
        d.m1();
//        inheritance.A ref ;0
//        ref = a ;
        a.m1();
//        ref =b;
        b.m1() ;
//        ref =c;
        c.m1() ;
    }
}

