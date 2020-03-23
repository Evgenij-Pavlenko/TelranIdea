package telran.data;

public class Animal {
    private String animalName;
    private int age;
    private String color;

    public Animal(String animalName, int age, String color) {
        this.animalName = animalName;
        this.age = age;
        this.color = color;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    public void run(){
        System.out.println(animalName + " run");
    }
}
