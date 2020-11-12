package inheritance;

class Demoo4{
    Demoo4(){
        System.out.println("Demo4 class..");
    }
}

class Demoo extends Demoo4 {
    //    Demoo(char q){
//        System.out.println("Hiii1");
//    }
    Demoo(){
//        super();
        System.out.println("Hiii1");
    }

    Demoo(int i){
//        super();
        this();                    // Used to Call the constructor of the same class and it must be the first statement
        System.out.println(i);
    }

}

class Demoo1 extends Demoo{

    Demoo1(){
//        super();                // Luchikiconstructor vitare hin thiba not in normal method
        System.out.println("Hiii2");
    }
    Demoo1(int i){
//        super();                 // Luchiki Achi
        this();                    // Used to Call the constructor of the same class and it must be the first statement
        System.out.println(i);
    }
    //TODO :- Some Important Notes sfor the Program :
    // Also By commenting the above codes of this class,
    // the super() method still going to come because Super() method is
    // By default called inside a constructor in the child class

    Demoo fun(){
        return this;   // Object 12345 0b1
    }

    void  show(){
        System.out.println("Hello");
    }
}

public class ThisAndSuperFunctionInDepth {     //  Demo4......
    public static void main(String[] args) {   //  Hiii1
        Demoo ob = new Demoo(3);             //  3
        Demoo1 ob1 = new Demoo1(4);          //  hii2
        //  4
//        System.out.println(ob1.fun());       //  Hello
        Demoo y = ob1.fun();
        if (ob1 == y) {
            ob1.show();
        }
    }
}


