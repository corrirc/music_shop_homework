import Instruments.InstrumentFamily;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before()  {
        piano = new Piano(InstrumentFamily.PERCUSSION, "piano1", 500.00, 700.00);
    }

    @Test
    public void instrumentFamily() {
        assertEquals("Percussion", piano.getInstrumentFamily());
    }

    @Test
    public void instrumentName() {
        assertEquals("piano1", piano.getName());
    }

    @Test
    public void testCanPlay() {
        assertEquals("pianonoise", piano.play());
    }

    @Test
    public void instrumentPrice() {
        assertEquals(500.00, piano.getPrice(), 00.1);
    }

    @Test
    public void markupPrice() {
        assertEquals(700.00, piano.getMarkup(), 00.1);
    }
}
