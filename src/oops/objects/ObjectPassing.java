package oops.objects;


//
//    // Java program to demonstrate objects
//// passing to methods.
//    class ObjectPassDemo
//    {
// //      ob
// //   a      b
//        int a, b;
//        ObjectPassDemo(int i, int j)
//        {
//            a = i;
//            b = j;
//        }
//        // return true if o is equal to the invoking
//        // object notice an object is passed as an
//        // argument to method                 //
//        boolean equalTo(ObjectPassDemo o)
//        {
//            return (o.a == a &&  o.b == b);
//        }
//    }
//
//    // Driver class
//    public class objectpassing.ObjectPassing
//    {
//        public void show(){
//            System.out.println("Dis");
//        }
//        public static void main(String args[])
//        {
//            ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
//            ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
//            ObjectPassDemo ob3 = new ObjectPassDemo(-1,-1);
//            System.out.println("Returns : " + ob3.equalTo(ob2));
//            System.out.println("ob1 == ob3: " + ob1.equalTo(ob2));
//        }
//    }
class Box
{
    double width, height, depth;
    Box(Box ob)
    {
        width = ob.width;     // 10
        height = ob.height;   // 20
        depth = ob.depth;     // 15
    }
    Box(double w, double h, double d)
    {
        width = w;   // 10
        height = h;  // 20
        depth = d;   // 15
    }
    double volume()
    {
        return width * height * depth; // 3000.0
    }
}
public class ObjectPassing
{
    public static void main(String args[])
    {
        Box mybox = new Box(10, 20, 15);
        Box myclone = new Box(mybox);
        double vol = mybox.volume();
        System.out.println("Volume of mybox is " + vol);
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }
}




