import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountryTest {

    Country country;

    @Before
    public void setUp(){
        country = new Country("USA", "Washington DC", 4.2);
    }

    @Test
    public void testConstructor(){
        assertEquals("USA", country.name);
        assertEquals("Washington DC", country.capital);
        assertEquals(4.2, country.worldShare, 0);
    }
}
