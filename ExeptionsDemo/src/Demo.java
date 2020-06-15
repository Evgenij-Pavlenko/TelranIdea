public class Demo {
    public static void main(String[] args) {
        DivisionResult result = div(5, 0);

//        if (result.isSuccess) {
//            System.out.println(result.result);
//        } else {
//            System.out.println("Result is unknown( probably division by zero)");
//        }

        String input = "abcdef";
    //    try {
            String resultString = processString(input); // C RuntimeExeption - без try/catch
            System.out.println("The string in processed: " + resultString);
//        } catch (StringIsToShortExeption ex) { // Если без RuntimeExeption
//            System.out.println("A "+ex.getMessage());
//        } catch (StringIsToLongExeption ex) {
//            System.out.println("B " + ex.getMessage());
//        }

        System.out.println("The programm is finished!");
    }

    public static String processString(String input) throws StringIsToLongExeption, StringIsToShortExeption{
        if (input.length()>3) {
            throw new StringIsToLongExeption("String is to long: " + input.length());
        } else {
            throw new StringIsToShortExeption("String is to short: " + input.length());
        }
    }

    public static class DivisionResult {
        boolean isSuccess = true;
        double result;

        public DivisionResult(boolean isSuccess, double result) {
            this.isSuccess = isSuccess;
            this.result = result;
        }
    }

    //devide a/b
    public static DivisionResult div(int a, int b) {
        if (b == 0) {
            return new DivisionResult(false, 0);
        }
        return new DivisionResult(true, a / b);
    }

    public static double div2(int a, int b) {
        return a / b;
    }

    ///////////////////////////////////

    // "abc" -> "ABC" length == 3
    // "abcd" - -> exeption


}
