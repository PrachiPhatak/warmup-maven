import org.junit.*;

import static org.junit.Assert.*;

public class CountryTest {

    Country country;

    @Before
    public void setUp(){
        System.out.println("In setup");
        country = new Country("USA", "Washington DC", 4.2);
    }

    @Test
    public void testConstructor(){
        System.out.println("In testConstructor");
        assertEquals("USA", country.name);
        assertEquals("Washington DC", country.capital);
        assertEquals(4.2, country.worldShare, 0);
    }

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("After class");
    }

    @After
    public void tearDown(){
        System.out.println("After");
    }
}
