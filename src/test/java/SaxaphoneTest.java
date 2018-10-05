import Instruments.InstrumentFamily;
import Instruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before() {
        saxaphone = new Saxaphone(InstrumentFamily.BRASS, "sax1" , 200.00);
    }


    @Test
    public void instrumentFamily() {
        assertEquals("Brass", saxaphone.getInstrumentFamily());
    }

    @Test
    public void testCanPlay() {
        assertEquals("saxanoise", saxaphone.play());
    }
}


