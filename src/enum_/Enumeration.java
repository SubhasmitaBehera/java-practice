package enum_;

enum Color
{
    RED,BLUE;

    void  show(){
        System.out.println("Method inside Enum");
    }
}

public class Enumeration
{

    public static void main(String[] args)
    {
        Color c1 = Color.BLUE;
        System.out.println(Color.RED);
        c1.show();
        Color.RED.show();
    }
}
