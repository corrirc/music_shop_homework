import Instruments.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {
    
    Drumsticks drumsticks;


    @Before
    public void before() {
        drumsticks = new Drumsticks("drumstick1", 5.00, 10.00, 10);
    }

    @Test
    public void canGetName() {
        assertEquals("drumstick1", drumsticks.getName());
    }


    @Test
    public void canGetPrice() {
        assertEquals(5.00, drumsticks.getPrice(), 00.1);
    }


    @Test
    public void canGetQuantity() {
        assertEquals(10, drumsticks.getQuantity());
    }


    @Test
    public void canSetQuantity() {
        drumsticks.setQuantity(0);
        assertEquals(0, drumsticks.getQuantity());
    }
}
