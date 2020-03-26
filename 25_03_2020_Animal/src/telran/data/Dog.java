package telran.data;

public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void play(){
        System.out.println("I play with a ball");
    }

    @Override
    public void voice() {
        System.out.println("Gav-gav");
    }

    @Override
    public String toString() {
        return "Dog: " +name +" age: " + age + " years";
    }
}
