package telran20200406;

public class ThreeNumbers {

    public int intMax(int a, int b, int c) {
        return (a > b) && (a > c) ? a : ((b > a) && (b > c) ? b : c);
    }
}
