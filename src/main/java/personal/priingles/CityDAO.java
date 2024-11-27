package personal.priingles;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CityDAO {

    private Connection con;


    public CityDAO (Connection con){
        this.con = con;
    }

    public City  getCitybyName(String cityName){
        City city = new City();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from city where name='"+cityName+"'");

            if(rs.next()) {
                city.id = rs.getInt("id");
                city.name = rs.getString("name");
                city.countryCode = rs.getString("countryCode");
                city.district = rs.getString("district");
                city.population = rs.getInt("population");
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(city != null) {
            return city;
        }else{
            throw new RuntimeException();
        }

    }
}
