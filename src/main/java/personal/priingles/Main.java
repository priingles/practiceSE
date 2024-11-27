package personal.priingles;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws Exception {
//
//        Thread.sleep(60000);

        CountryService countryService;
        db_util db = new db_util();


        Connection con = db.getDbConnection();




        countryService = new CountryService(con);
        Country country = countryService.getCountry_Name("Argentina");
        String[] a = country.displayCountry();




        System.out.println(Arrays.toString(a));



        //con.close();
             }
}
