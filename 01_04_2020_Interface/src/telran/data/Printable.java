package telran.data;

public interface Printable {

    void print();

    default void print2(){
        System.out.println("Undefinied");

    }
   static void print1(){
       System.out.println("Reading is good");
   }
}
