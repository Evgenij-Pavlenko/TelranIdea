public class Test {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
        System.out.println(Math.pow(2,2));
    }

    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        int start = n*(n-1)+1;
        for (int i = 0; i < n; i++) {
            sum+=start;
            start+=2;
        }
        return sum;
    }


}

