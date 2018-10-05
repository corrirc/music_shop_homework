import Instruments.InstrumentFamily;
import Instruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before() {
        saxaphone = new Saxaphone(InstrumentFamily.BRASS, "sax1" , 200.00, 300.00);
    }


    @Test
    public void instrumentFamily() {
        assertEquals("Brass", saxaphone.getInstrumentFamily());
    }

    @Test
    public void instrumentName() {
        assertEquals("sax1", saxaphone.getName());
    }

    @Test
    public void testCanPlay() {
        assertEquals("saxanoise", saxaphone.play());
    }

    @Test
    public void instrumentPrice() {
        assertEquals(200.00, saxaphone.getPrice(), 00.1);
    }

    @Test
    public void markupPrice() {
        assertEquals(300.00, saxaphone.getMarkup(), 00.1);
    }
}


