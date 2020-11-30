package fileIO.object;

import java.io.ObjectStreamClass;
import java.io.Serializable;

public class ObjectStreamClassDemo {
    static final int var = 0 ;
    public static void main(String arg[]) {
        // creating object stream class for Number
        ObjectStreamClass geeks_stream = ObjectStreamClass.lookup(Number.class);
        ObjectStreamClass quiz_stream = ObjectStreamClass.lookupAny(ObjectStreamClass.class);
        ObjectStreamClass quiz_stream1 = ObjectStreamClass.lookupAny(Serializable.class);

        // checking class instance
        System.out.println(geeks_stream.forClass());
        System.out.println(quiz_stream.forClass());
        System.out.println(quiz_stream1.forClass());

//        System.out.println(geeks_stream.getField("quiz_stream")); // null - it has no field
//        System.out.println(geeks_stream.getFields()); //

//         class name
        System.out.println("class name: " + geeks_stream.getClass());

        // checking serial version UID
        System.out.println(geeks_stream.getSerialVersionUID());

        System.out.println(geeks_stream.toString());

    }
}
