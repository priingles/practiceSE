package personal.priingles;

import java.sql.*;

public class CountryDAO {

    private Connection con;

    public CountryDAO(Connection con) {
        this.con = con;
    }

    public Country getCountrybyName(String countryName) throws Exception {
        Country country = new Country();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from country where Name = '" + countryName + "'");
            if (rs.next()) {
                country.code = rs.getString("Code");
                country.name = rs.getString("Name");
                country.continent = rs.getString("Continent");
                country.region = rs.getString("Region");
                country.surfaceArea = rs.getDouble("SurfaceArea");
                country.indepYear = rs.getInt("IndepYear");
                country.population = rs.getInt("Population");
                country.lifeExpectancy = rs.getDouble("LifeExpectancy");
                country.gnp = rs.getDouble("Gnp");
                country.gnpOld = rs.getDouble("GnpOld");
                country.localName = rs.getString("LocalName");
                country.governmentForm = rs.getString("GovernmentForm");
                country.headOfState = rs.getString("HeadOfState");
                country.capital = rs.getInt("Capital");
                country.code2 = rs.getString("Code2");


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (country != null) {
            return country;
        } else {
            throw new Exception();
        }
    }
}
