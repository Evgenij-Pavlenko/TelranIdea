package telran;

public class Main {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;

        Integer c = 500;
        Integer d = 500;
        System.out.println(a==b);
        System.out.println(c==d);//false
        System.out.println(c.equals(d));//true
        System.out.println(c.compareTo(d)); // 0  (null)

        String str = "Hello! ";
        String str2 = "hello!";
        String str1 = "Vasya!";

        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str2));

        str1 = str.concat(str1);
        System.out.println(str1);
        str1 = str1.replace("! ", ", ");
        System.out.println(str1);
        System.out.println(str1.codePointAt(1));

        String str3 = "one, two, three, ";
        String[] str4 = str3.split(", ");
        System.out.println(str4[0]);
        System.out.println(str3.replace(" ", ""));




    }
}
