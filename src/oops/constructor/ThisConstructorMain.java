package oops.constructor;


public class ThisConstructorMain {
    public static void main(String[] args) {
        ThisConstructorDemo b1 = new ThisConstructorDemo();

        System.out.println("The values of the fields before the parameterised constructor " +
                "invocation : "+b1.getRoomName()+ " "+ b1.getBulbs()+" "+b1.getRooms()
                +" "+b1.isSame());

        ThisConstructorDemo bedRoom= new ThisConstructorDemo(4,4,"NewRoom");

        System.out.println("The values of the fields after the parameterised constructor " +
                "invocation : "+bedRoom.getRoomName()+ " "+ bedRoom.getBulbs()+" "+bedRoom.getRooms()
                +" "+bedRoom.isSame());
    }
}

