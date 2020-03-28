package telran;

public class C extends B {
    String x = ("class C");

    void printC(){
        System.out.println(x);
        System.out.println("C-> " + ((B)this).x);
        System.out.println("C-> " + ((A)this).x);
    }
}
