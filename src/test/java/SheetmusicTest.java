import Instruments.Sheetmusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetmusicTest {

    Sheetmusic sheetmusic;


    @Before
    public void before()  {

        sheetmusic = new Sheetmusic("sheetmusic1", 2.00, 5.00, 20);
    }


    @Test
    public void canGetName() {
        assertEquals("sheetmusic1", sheetmusic.getName());
    }

    @Test
    public void canGetPrice () {
        assertEquals(2.00, sheetmusic.getPrice(), 00.1);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(20, sheetmusic.getQuantity(), 00.1);
    }
}
