package oops.objects;

class Complex {
    private double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public Complex(Complex o) {
        this.re = o.re;
        this.im = o.im;
    }
}
//
//// Driver class to test the Complex class
public class ObjectClassDemo2 {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
//        int arr[] = new int[10];
//        Complex c3 = new Complex(c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        String str2 = new String("bhu");
        String str3 = new String("bhu");
        System.out.println(str2 == str3);  // String Objects are Immutable
        String name = str2;
        String srr = "Bibhu";
        String str1 = "Bibhu";
        System.out.println(name.equals(str1));
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}
