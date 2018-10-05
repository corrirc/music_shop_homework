import Instruments.InstrumentFamily;
import Instruments.Saxaphone;
import Shops.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Saxaphone saxaphone;

    @Before
    public void before()  {
        shop = new Shop("Music Shop");
        saxaphone = new Saxaphone(InstrumentFamily.BRASS, "sax1", 200.00, 300.00);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }
}
