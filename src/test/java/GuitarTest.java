import Instruments.Guitar;
import Instruments.InstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void before()  {
        guitar = new Guitar(InstrumentFamily.STRINGS, "guitar1", 100.00, 200.00);
    }

    @Test
    public void instrumentFamily() {
        assertEquals("Strings", guitar.getInstrumentFamily());
    }

    @Test
    public void instrumentName() {
        assertEquals("guitar1", guitar.getName());
    }

    @Test
    public void testCanPlay() {
        assertEquals("guitarnoise", guitar.play());
    }

    @Test
    public void instrumentPrice() {
        assertEquals(100.00, guitar.getPrice(), 00.1);
    }

    @Test
    public void markupPrice() {
        assertEquals(200.00, guitar.getMarkup(), 00.1);
    }
}
