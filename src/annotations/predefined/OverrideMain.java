package annotations.predefined;


class ParentClass {
    public void displayMethod(String msg) {
        System.out.println(msg);
    }
}
public class OverrideMain extends ParentClass
{
    @Override
    public void displayMethod(String msg){
        System.out.println("Message is: "+ msg);
    }
    public static void main(String args[]){
        OverrideMain obj = new OverrideMain();
        obj.displayMethod("Hey!!");
    }
}
