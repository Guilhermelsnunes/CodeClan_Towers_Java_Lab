import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Paul");
    }

    @Test
    public void guestNotCheckedIn(){
        assertEquals(false, guest.isCheckedIn());
    }

    @Test
    public void canCheckInGuest(){
        guest.setCheckedIn(true);
        assertEquals(true, guest.isCheckedIn());
    }




}
