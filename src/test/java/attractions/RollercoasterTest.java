package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void testDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void testPriceForTall(){
        Visitor visitor = new Visitor(24, 202, 20.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void testPriceFor(){
        Visitor visitor = new Visitor(24, 195, 20.00);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void testIsAllowedTo(){
        Visitor visitor = new Visitor(18, 146, 20);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void testIsNotAllowedTo(){
        Visitor visitor = new Visitor(12, 138, 20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }
}
