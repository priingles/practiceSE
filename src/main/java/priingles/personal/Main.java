package priingles.personal;

public class Main {
    public static void main(String[] args) {
        App a = new App();


        a.connect();

        Country nigeria = a.getCountry("Nigeria");
        nigeria.displayCountry();
        Continent Asia = a.getCountryinContinent("Asia");

        a.disconnect();
    }
}
