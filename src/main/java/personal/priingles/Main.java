package personal.priingles;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    

    public static void main(String[] args) throws Exception {

        CountryService countryService;
        db_util db = new db_util();
        db.connect();


        //Connection con = db_util.getDbConnection();


        /**countryService = new CountryService(con);
        Country country = countryService.getCountry("Nigeria");
        String[] a = country.displayCountry();




        System.out.println(Arrays.toString(a));



        //con.close();
         **/
             }
}
