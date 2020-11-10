package annotations.predefined;

import java.util.ArrayList;
@FunctionalInterface
interface Abc {
    void show();
//    void display();
}

class A{
    public void showMyData(){
        System.out.println("A");
    }
}
class B extends A{
    @Deprecated
    public void show(){

    }

    @Override
    @SuppressWarnings("unchecked")
// also can be write as @SuppressWarnings(value = "unchecked")

    public void  showMyData(){
        ArrayList obj = new ArrayList();
        // this causes unchecked warning
        obj.add("C");
        System.out.println("B");
    }
}
public class AnnotationsDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showMyData();
        obj.show();
    }
}
