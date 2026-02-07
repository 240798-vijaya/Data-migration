public class Animal {

    // variables
    public String name;
    public String species;

    // constructor
    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    // methods
    public String getName(){
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
