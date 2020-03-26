package telran.data;

public class Horse extends Animal {
    public Horse(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("Igo-go-go");
    }

//    @Override
//    public String toString() {
//        return "Horse: " + name + " age: " + age + " years";
//    }
    @Override
    public String toString() {
        return super.toString()+ "Horse: " + name + " age: " + age + " years";
    }
}
