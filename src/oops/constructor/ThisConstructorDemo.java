package oops.constructor;


public class ThisConstructorDemo {
    private int rooms;
    private int bulbs;
    private String roomName;
    private boolean isSame;

    public ThisConstructorDemo(int rooms, int bulbs, String roomName) {
        this();
        this.rooms = rooms;
        this.bulbs = bulbs;
        this.roomName = roomName;
    }

    public ThisConstructorDemo() {
        this.bulbs = 4;
        this.isSame= false;
        this.roomName = "Room1";
    }

    public int getRooms() {
        return rooms;
    }

    public int getBulbs() {
        return bulbs;
    }

    public String getRoomName() {
        return roomName;
    }

    public boolean isSame() {
        if (this.rooms == this.bulbs)
            return true;
        else
            return false;
    }
}

