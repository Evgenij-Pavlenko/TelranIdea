public class Test {
    public static void main(String[] args) {
        int[] intArray = {5, 7, 10, 12};
        reversArray(intArray);

    }

    public static int[] reversArray(int[] intArray) {
        int temp = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            intArray[i - 1] = intArray[i];
        }
        intArray[intArray.length - 1] = temp;
        return intArray;
    }
}
