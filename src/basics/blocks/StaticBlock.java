package basics.blocks;

public class StaticBlock {
    public static void main(String[] args){
        System.out.println("Hey");
//        Bablu1 xyz = new Bablu1();
//        xyz.Bibhu();
//        Miki();
    }

    {
        System.out.println("Miki");
    }
    static {
        System.out.println("b");
    }
    public  void Bibhu(){
        System.out.println("Bibbu");
    }
}
