import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, "Sunset");
        guest = new Guest("Jason");
    }

    @Test
    public void startsWithZeroGuests(){
        assertEquals(0, conferenceRoom.getGuestList().size());
    }

//    @Test
//    public void canUsePrivateListMethod(){
//        conferenceRoom.getGuestList(guest);
//    }
}
