package Chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnicornHotelTest {
    UnicornHotel unicornHotel;
    @BeforeEach
    void startAllTestWith(){
        unicornHotel = new UnicornHotel(5);

    }
    @Test
    void checkThatHotelExist(){
    assertNotNull(unicornHotel);
}
@Test
void weHaveRoomsAndItEmpty(){
        String [] rooms = unicornHotel.getRooms();
        assertNotNull(rooms);
    for(String room : rooms){
        assertNull(room);
    }
    }
@Test
void testthatRooomCanBeBooked(){
        try{
            String name = "segun";
            String result = unicornHotel.bookRoom(name);
            assertNotNull(result);
            assertEquals(name, unicornHotel.getRoomGuest(1));
            String name2 = "lekan";
            unicornHotel.bookRoom(name2);
            assertEquals(name2, unicornHotel.getRoomGuest(2));
        }catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }
//        String name3 = "Perry";
//
//        try{
//            unicornHotel.bookRoom(name3);
//        }catch(IllegalAccessException e){
//            System.out.println(e.getMessage());
//        }

//        unicornHotel.bookRoom(name3);
//        assertEquals(name3, unicornHotel.getRoomGuest(3));
}

//    @Test
//    void throwsAnExceptionWhenYouGetRoomWrongly(){
//        assertThrows(IllegalAccessException.class, () -> unicornHotel.getRoomGuest(1));
//    }
    @Test
    void checkOutOfHotelRoom(){
      assertTrue(unicornHotel.checkOut(1));
      unicornHotel.bookRoom("perry");
     // assertEquals("perry", unicornHotel.getRoomGuest(1));
    }
}
