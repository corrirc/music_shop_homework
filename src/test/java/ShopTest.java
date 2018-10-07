import Instruments.Guitar;
import Instruments.InstrumentFamily;
import Instruments.Piano;
import Instruments.Saxaphone;
import Shops.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Saxaphone saxaphone;
    Guitar guitar;
    Piano piano;


    @Before
    public void before()  {
        shop = new Shop("Music Shop");
        saxaphone = new Saxaphone(InstrumentFamily.BRASS, "sax1", 200.00, 300.00);
        guitar = new Guitar(InstrumentFamily.STRINGS, "guitar1", 100.00, 200.00);
        piano = new Piano(InstrumentFamily.PERCUSSION, "piano1", 500.00, 700.00);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddToStock() {
        shop.add(saxaphone);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.removeStock(saxaphone);
        assertEquals(0, shop.stockCount());
    }
}
