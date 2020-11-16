package oops.inheritance;


class Base{

    int data;
    void increment(){
        data++;
    }
    Base(){
        data++;        // 1
        increment();   //
    }
}

class Sub extends Base{
//    void increment(){
//        data++;
//    }
//int data;void increment(){
//        data++;
//    }

    Sub(){
        // super();       // Luchiki Achi
        increment();
        data++; // 12
    }
    //    inheritance.Sub(int a){
//        System.out.println(a);
//        increment();
//        data++;  // 12
//    }
    void increment(){
        data += 5;  // 17
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Base ob2 = new Base(); //
        ob2.increment();
        System.out.println(ob2.data);
//        inheritance.Sub sb = new inheritance.Sub();
//        sb.increment();
//        System.out.println(sb.data);
    }
}

