package personal.priingles;

public class Country {

    public String name;
    public int population;
    public String continent;
    public String code;

    public String[] displayCountry(){

        String Population = Integer.toString(population);

        String[] coun = {code, name, continent,Population};


        return coun;
    }

}
