package oops.objects;


class another{
    private int dis(){
        int g = 12;
        return g;
    }
    public int display1(){
        dis();
        System.out.println(dis());
        int e = 16 ;
        return e;
    }
}

class Outer {
    //    ab.display1();
    private int d = 67;
    private int display() {
        int b = 16;
        return b;
    }
    // Simple nested inner class
    protected class Inner {
        public void show() {
            Outer inn = new Outer();
//            System.out.println(display1());
            System.out.println(inn.display()); //16
            int c = inn.display();  //
            System.out.println(c);  // 16
            System.out.println(d);  // 67
            System.out.println("In a nested class method");
        }
    }
}
public class Oop2 {
    public static void main(String[] args) {
        another ab = new another();

        System.out.println(ab.display1());
//        ab.dis();
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}


//filename: Main.java



