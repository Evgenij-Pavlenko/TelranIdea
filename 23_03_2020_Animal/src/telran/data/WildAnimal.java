package telran.data;

public class WildAnimal extends Animal {

    private String habitat;
    private double population;

    public WildAnimal(String animalName, int age, String color, String habitat, double population) {
        super(animalName, age, color);
        this.habitat = habitat;
        this.population = population;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "habitat='" + habitat + '\'' +
                ", population=" + population +
                '}';
    }
    public void migration(){
        System.out.println(getAnimalName() + " going south");
    }
    @Override
    public void run(){
        System.out.println(getAnimalName() + " running faster");
        System.out.println(super.getAge() +" years old");
    }
}
