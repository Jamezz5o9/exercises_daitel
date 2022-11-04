package Chapter8;

public class UnicornHotel {
public String[] rooms;

public UnicornHotel(int numberOfRooms){
    this.rooms = new String[numberOfRooms];
}
public String bookRoom(String name){
     for(int row = 0; row < rooms.length; row++){
        if(rooms[row] == null){
            rooms[row] = name;
            break;
        } else {
            System.out.println("All the rooms are fully booked pls!!!");
        }
    }
    return "The room is booked successfully";
}

public String getRoomGuest(int roomNumber)throws IllegalAccessException{
    return rooms[roomNumber - 1];
}

    public String[] getRooms() {
    return rooms;
    }

    public boolean checkOut(int roomNumber) {
    boolean result = false;
    if(rooms[roomNumber - 1] == null){
        result = true;
    }
    return result;
    }
}
