import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Guest guest2;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, "Sunset");
        guest = new Guest("Jason");
        guest2 = new Guest("Schmikle");
    }

    @Test
    public void startsWithZeroGuests(){
        assertEquals(0, this.conferenceRoom.getGuestListSize());
    }

    @Test
    public void canAddGuestToGuestList(){
        this.conferenceRoom.addGuest(guest);
        assertEquals(1, this.conferenceRoom.getGuestListSize());
    }

    @Test
    public void canRemoveAllGuestsFromList(){
        this.conferenceRoom.addGuest(guest);
        this.conferenceRoom.addGuest(guest);
        this.conferenceRoom.emptyGuestList();
        assertEquals(0, this.conferenceRoom.getGuestListSize());
    }

    @Test
    public void canRemoveGuestByName(){
        this.conferenceRoom.addGuest(guest);
        this.conferenceRoom.addGuest(guest);
        this.conferenceRoom.addGuest(guest2);
        this.conferenceRoom.removeGuest(guest);
        this.conferenceRoom.getNames();
        assertEquals(2,this.conferenceRoom.getGuestListSize());
    }
}
