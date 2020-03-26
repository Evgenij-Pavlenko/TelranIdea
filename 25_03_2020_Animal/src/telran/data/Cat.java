package telran.data;

public class Cat extends Animal{

    public Cat(int age, String name) {
        super(age, name);
    }

    public void play(){
        System.out.println("i play with mous");
    }

    @Override
    public void voice() {
        System.out.println("meow-meow");
    }

    @Override
    public String toString() {
        return "Cat: " + name + " age: " + age + " years";
    }
}
