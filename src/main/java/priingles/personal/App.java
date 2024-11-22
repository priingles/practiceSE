package priingles.personal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


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
                Thread.sleep(60000);
                c = DriverManager.getConnection("jdbc:mysql://practice-db:3306/employees?useSSL=false", "root", "example");
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
}