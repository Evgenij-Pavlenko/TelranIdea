package telran;

public class B extends A {
    String x = ("class B");

    void printB(){
        System.out.println(x);
        System.out.println("B-> " + ((A)this).x);
    }
}
