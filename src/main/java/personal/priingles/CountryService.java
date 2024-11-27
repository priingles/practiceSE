package personal.priingles;

import java.sql.Connection;
import java.util.ArrayList;

public class CountryService {

    private CountryDAO countryDAO;

    public CountryService(Connection con) {
        this.countryDAO = new CountryDAO(con);
    }

    public Country getCountry_Name(String countryName) throws Exception {
        return countryDAO.getCountrybyName(countryName);
    }


    public ArrayList<Country> getCountry_Continent(String continentName) throws Exception {
        return countryDAO.getCountrybyContinent(continentName);
    }
}
