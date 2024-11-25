package personal.priingles;

public class Country {

    public String code;
    public String name;
    public String continent;
    public String region;
    public double surfaceArea;
    public int indepYear;
    public int population;
    public double lifeExpectancy;
    public double gnp;
    public double gnpOld;
    public String localName;
    public String governmentForm;
    public String headOfState;
    public int capital;
    public String code2;

    String[] coun;



    public String[] displayCountry(){


        if(name != null) {
            String Population = Integer.toString(population);
            String[] coun = {code, name, continent, Population};
            this.coun = coun;
        }else {
            System.out.println("Country is null");
        }

        return coun;
    }

}
