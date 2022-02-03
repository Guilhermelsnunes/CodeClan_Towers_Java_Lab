import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE,23);
        guest = new Guest("John");
        this.bedroom.addGuest(guest);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1,bedroom.getTypeCapacity());
    }

    @Test

}
