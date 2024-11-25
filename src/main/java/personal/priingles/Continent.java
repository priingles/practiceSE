package personal.priingles;

import java.util.ArrayList;

public class Continent {

    public String name;
    public ArrayList<Country> countries;

    public String[] displayContinent(){

        int num = countries.size();
        String[] cont = {name, num + ""};
        return cont;
    }

    public void displayCountries() {



    }

}
