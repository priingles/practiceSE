package priingles.personal;

import java.sql.*;


public class App {

    private Connection c = null;
    public void connect() {

        System.out.println("just BETTER!");

        try {
            //load db driver
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        int retry = 5;

        for (int i = 0; i < retry; i++) {
            try {
                Thread.sleep(70000);
                c = DriverManager.getConnection("jdbc:mysql://practice-db:3306/world?useSSL=false", "root", "example");
                System.out.println("Connected!");
                Thread.sleep(10000);
                break;
            }
            catch (SQLException sqle) {
                System.out.println("Failed!");
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie) {
                System.out.println("Failed!, Interrupted");
            }
        }

    }

    public void disconnect() {
        if (c != null) {
            try {
                c.close();
                System.out.println("Disconnected!");
            }
            catch (Exception e) {
                System.out.println("Failed to close!");
            }
        }
    }

    public Connection getConnection() {
        return c;
    }

    public Country getCountry(String country){

        int population;
        String name;
        String code;
        String continent;

        try {
            Statement statement = c.createStatement();
            String query = "SELECT * FROM country WHERE name = '"+country+"'";
            ResultSet rs = statement.executeQuery(query);

            if(rs.next()){

                Country coun = new Country();
                coun.population = rs.getInt("Population");
                coun.name = rs.getString("Name");
                coun.continent = rs.getString("Continent");
                coun.code = rs.getString("Code");
                return coun;
            }
            else{
                return null;
            }
        } catch (Exception e) {
            System.out.println("Failed to get Country");
            throw new RuntimeException(e);
        }


    }
}