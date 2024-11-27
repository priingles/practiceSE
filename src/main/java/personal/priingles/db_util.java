package personal.priingles;

import java.sql.*;
import java.util.ArrayList;


public class db_util {

    private Connection con = null;

    public static Connection getDbConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=true", "root", "example");
    }
    public static Connection getTestConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");
    }

    public void connect() throws SQLException {

        System.out.println("connecting...");

        try {
            //load db driver
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        int retry = 2;

        for (int i = 0; i < retry; i++) {
            try {

                Thread.sleep(70000);
                //passing db url
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Connected!");
                Thread.sleep(10000);
                break;
            }

            catch (InterruptedException ie) {
                System.out.println("Failed!, Interrupted");
            }
        }

    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
                System.out.println("Disconnected!");
            }
            catch (Exception e) {
                System.out.println("Failed to close!");
            }
        }
    }

    public Connection testConnection() throws SQLException {

        return DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");

    }

    public Country getCountry(String country){

        int population;
        String name;
        String code;
        String continent;

        try {
            Statement statement = con.createStatement();
            String query = "SELECT * FROM country WHERE name = '"+country+"'";
            ResultSet rs = statement.executeQuery(query);

            if(rs.next()){

                Country coun = new Country();
                coun.population = rs.getInt("Population");
                coun.name = rs.getString("Name");
                coun.continent = rs.getString("Continent");
                coun.code = rs.getString("Code");

                if(coun != null){
                    return coun;
                }else{throw new Exception();}

            }
            else{
                return null;
            }
        } catch (Exception e) {
            System.out.println("Failed to get Country");
            throw new RuntimeException(e);
        }


    }

    public Continent getCountryinContinent(String inContinent){

        int population;
        String name;
        String code;
        String continent;

        try {

            Continent cont = new Continent();
            Statement statement = con.createStatement();
            String query = "SELECT * FROM country WHERE continent = '"+inContinent+"'";
            ResultSet rs = statement.executeQuery(query);

            ArrayList<Country> countries = new ArrayList<>();

            while(rs.next()){

                Country coun = new Country();
                coun.population = rs.getInt("Population");
                coun.name = rs.getString("Name");
                coun.continent = rs.getString("Continent");
                coun.code = rs.getString("Code");
                countries.add(coun);
            }
            cont.countries = countries;
            cont.name = inContinent;
            return cont;

        } catch (Exception e) {
            System.out.println("Failed to get Country");
            throw new RuntimeException(e);
        }

    }
}