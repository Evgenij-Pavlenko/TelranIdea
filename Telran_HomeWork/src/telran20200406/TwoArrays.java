package telran20200406;

public class TwoArrays {
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0]==b[0])||(a[a.length-1]==b[b.length-1]);
    }
}
