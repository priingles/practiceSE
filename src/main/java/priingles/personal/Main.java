package priingles.personal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {

        System.out.println("just BETTER!");

        try {
            //load db driver
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection c = null;
        int retry = 5;

        for (int i = 0; i < retry; i++) {
            try {
                Thread.sleep(1000);
                c = DriverManager.getConnection("jdbc:mysql://db:3306/employees?useSSL=false", "root", "example");
                System.out.println("Connected!");
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
        if (c != null) {
            try {
                c.close();
            }
            catch (Exception e) {
                System.out.println("Failed to close!");
            }
        }
    }
}