package exception_handling;

import java.io.IOException;

class Parents {
    void msg() throws Exception {System.out.println("parent");}
}

class TestExceptionChild2 extends Parents{
    void msg() throws IOException {System.out.println("child");}

    public static void main(String args[]){
        TestExceptionChild2 p= new TestExceptionChild2();
        try{
            p.msg();
        }catch(Exception e){}
    }
}

class Parent{
    void msg()throws Exception{System.out.println("parent");}
}

class TestExceptionChild5 extends Parent{
    void msg(){System.out.println("child");}

    public static void main(String args[]) throws Exception{
        Parent p=new TestExceptionChild5();
//        try{
        p.msg();
//        }catch(Exception e){}
    }
}

