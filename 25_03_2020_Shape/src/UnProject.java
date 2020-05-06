public class UnProject {
    public static void main(String[] args) {
        System.out.println(near10(1, -2));
    }

    public static int near10(int a, int b) {
        int a10 = Math.abs(a-10); //from 'a' to 10
        int b10 = Math.abs(b-10); //from 'b' to 10
        return (a10 == b10) ? 0 : (a10 < b10) ? a : b;

    }
}
