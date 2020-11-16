package oops.objects;

// OBJECT CLASS :
// Object class is the parent/super class of every class
// the methods present in object class are :
// 1. toString() 2. hashCode() 3. equals() 4. getClass 5.finalize 6. clone etc..
// Below is/are the programs to illustrate some of the above methods

// Java program to demonstrate working of
// hasCode() and toString()


public class ObjectClassDemo
{
    static int last_roll = 100; // why output is 100?
    int roll_no;
    ObjectClassDemo()
    {
        roll_no = last_roll;
        last_roll++;
    }
    @Override
    public int hashCode()
    {
        return roll_no;
    }

    public String toString(){
        return "Hello";
    }
    public void show(){
        System.out.println("hi");
    }
    public static void main(String args[])
    {
        ObjectClassDemo s = new ObjectClassDemo();
        ObjectClassDemo obj = new ObjectClassDemo();
        System.out.println(s);  // toString() method by Default called if there is no explicit toString() is
        // there in the present class
        System.out.println(s.toString()); // objectclass.ObjectClassDemo@12cde23
        System.out.println(s.hashCode());
        int a = s.hashCode();
        System.out.println(Integer.toHexString(a));
        System.out.println(s.equals(obj));  //
    }
}





