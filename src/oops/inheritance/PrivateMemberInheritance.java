package oops.inheritance;


class O {

    private int a = 8;
    private void met1(){
        System.out.println("HELLO1..");
    }

    public void dis1(){
        System.out.println(a);
        met1();
        System.out.println("Hi1..");
    }
}

class P extends O {

    void dis(){
        System.out.println("Hi2..");
    }
}

public class PrivateMemberInheritance {
    public static void main(String[] args) {
//        inheritance.O ob1 = new inheritance.O();
//        ob1.met1();
        P ob = new P();
        ob.dis();
        ob.dis1();
    }
}

