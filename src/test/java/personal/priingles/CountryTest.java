package personal.priingles;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;
import personal.h2Entities.TestCountry;
import personal.util.HibernateUtil;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CountryTest {
    @Test
    public void testDisplayCountry() {

        Country country = new Country();
        country.name = "Non";
        country.population = 2;
        country.code = "NNN";
        country.continent = "Nowhere";


        String[] a = {"NNN", "Non", "Nowhere", "2"};
        String[] actual = country.displayCountry();

        assertArrayEquals(a, actual);


    }

}
