/**
 * Created by Ziv.ben.aharon on 08/07/2014.
 */
public class Bird {
    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public Boolean getFlight() {
        return flight;
    }

    public int getWeight() {
        return weight;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFlight(Boolean flight) {
        this.flight = flight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    String species;
    String color;
    Boolean flight;
    int weight;

}
