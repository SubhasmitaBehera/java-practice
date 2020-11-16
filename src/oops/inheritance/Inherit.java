package oops.inheritance;


class Bicycle
{
    // the inheritance.Bicycle class has inheritance.two fields
    public int gear;   // Data Member   3
    public int speed;  // Data Member  100

    // the inheritance.Bicycle class has inheritance.one constructor
    public Bicycle(){
        System.out.println("Constructor of inheritance.Bicycle is printed");
    }

    public Bicycle(int gear, int speed)  // Constructor
    {
        this.gear = gear;
        this.speed = speed;
    }


    // the inheritance.Bicycle class has three methods
    public void applyBrake(int decrement)   // Member Function
    {
        speed -= decrement;  // 97
    }

    public void speedUp(int increment)      // Member Function
    {
        speed += increment;   //  101
    }

    // toString() method to print info of inheritance.Bicycle
    public String toString()                 // Member Function
    {
        return("No of gears are "+gear
                +"\n"
                + "speed of bicycle is "+speed);
    }
}

// derived class
class MountainBike extends Bicycle {

    // the inheritance.MountainBike subclass adds inheritance.one more field
    public int seatHeight; // 25 // 4
    public MountainBike(){
//        super();
        this.setHeight(3);
        System.out.println("Constructor of inheritance.MountainBike class");
        super.applyBrake(2);
    }

    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        super(gear, speed);         // 3 ,100
        seatHeight = startHeight;
    }

    // the inheritance.MountainBike subclass adds inheritance.one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of inheritance.Bicycle to print more info

//    public String toString()                 // Member Function
//    {
//        return("No of gears are "+gear
//                +"\n"
//                + "speed of bicycle is "+speed);
//    }
//}

    public String toString() {
        return (super.toString() +
                "\nseat height is " + seatHeight);
    }

}

// driver class
public class Inherit{
    public static void main(String[] args)
    {
        MountainBike mb = new MountainBike(3, 100, 25);
        mb.applyBrake(3);
        mb.speedUp(4);
        mb.setHeight(4);
        System.out.println(mb.toString());
    }
}



