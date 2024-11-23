package priingles.personal;

import java.util.ArrayList;

public class Continent {

    public String name;
    public ArrayList<Country> countries;

    public void displayContinent(){
        System.out.println("Continent: " + name);
        int num = countries.size();
        System.out.println("Number of countries: " + num);

    }

    public void displayCountries() {



    }

}
