package personal.priingles;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ContinentTest {

    @Test
    public void testDisplayContinent() {


        Continent cont = new Continent();
        cont.name = "Asia";

        ArrayList<Country> countries = new ArrayList<>();
        int pop = 0;
        while(pop < 20) {
            Country country = new Country();
            country.name = "Non";
            country.population = pop;
            country.code = "NNN";
            country.continent = "Nowhere";
            pop++;

            countries.add(country);
        }

        cont.countries = countries;

        String[] a = {"Asia", "20"};
        String[] actual = cont.displayContinent();
        assertArrayEquals(a,actual);
    }

}