package telran;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    public static int factorial (int n){
        if(n == 1)
            return 1;
        else
            return (n*factorial(n-1));
    }
}
//11416
//Exception in thread "main" java.lang.StackOverflowError