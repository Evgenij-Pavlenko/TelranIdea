package telran.data;

public abstract class Animal {
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void voice();
    public void play(){
        System.out.println("I play");
    }

    @Override
    public String toString() {
        return "Animal: ";
    }
}
