package basics.blocks;

public class BlocksDemo {
    static int a;

    static {  // static block
        System.out.println("Static block");
        System.out.println("Static block");
    }


    { // instance block / non static block

        System.out.println("instance block ");
        if (a == 0){
            System.out.println("sorry");
        }
    }

    public static void main(String[] miki) { // instead of" args" we can use "any parameter name"
//        String names[] ={"Suman","MIKI"};

        new BlocksDemo(); // creating instance of the class
        new BlocksDemo();

        System.out.println(miki.length); // ctrl shift upArrow
        if (miki.length == 0){
            System.out.println("Adding array index :");
            miki = new String[2];
            miki[0] = "first";
            miki[1] = "Second";
        }
        System.out.println("Array 1st index value "+miki[0]);
        System.out.println("Array 2nd index value "+miki[1]);
    }
}

