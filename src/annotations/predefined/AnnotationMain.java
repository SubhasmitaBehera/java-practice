package annotations.predefined;


import java.util.ArrayList;
//@FunctionalInterface
interface Abc1{
    public void show();
//    public void display();

}

class P{
//    @Deprecated

    public  void show(){

    }

    public void showMyData(){

        System.out.println("A");
    }

    public void finalize(){

    }
}

class Q extends P{
//    @Override
//    @SuppressWarnings("all")
//    @SuppressWarnings(value = "unchecked")
    public void showMyData(){
        System.out.println("B");
        ArrayList obj2 = new ArrayList();
        obj2.add("mango");
        System.out.println(obj2);
    }

    public class Calculator {
//        @SuppressWarnings("checked")

        public  int sum(int x,int y){
            return 0;
        }
    }
}


public class AnnotationMain {
    public static void main(String[] args) {
       P obj = new P();
       obj.show();
       Q obj1 = new Q();
       obj1.showMyData();


    }
}
