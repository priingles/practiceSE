package personal.h2Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import personal.priingles.Country;

@Entity
public class TestCountry extends Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int population;
    private String code;
    private String continent;

    //Getters and setters


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }


    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }


    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
}
