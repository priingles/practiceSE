package personal.priingles;

import java.sql.Connection;

public class CountryService {

    private CountryDAO countryDAO;

    public CountryService(Connection con) {
        this.countryDAO = new CountryDAO(con);
    }

    public Country getCountry(String countryName) throws Exception {
        return countryDAO.getCountrybyName(countryName);
    }
}
