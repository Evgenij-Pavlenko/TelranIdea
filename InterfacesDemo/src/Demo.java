import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Faxable fax = new FaxDevice();

        Faxable fax2 = new Faxable() {
            @Override
            public void sendFax(String message) {
                System.out.println("Sending a message " + message);
            }

            @Override
            public String receiveFax() {
                String received = "receivied something";
                System.out.println(received);
                return received;
            }
        };
        fax2.receiveFax();
        fax2.sendFax("Hello world");

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(c.compare(5, 10));

        FaxDevice fd = new FaxDevice() {
            public void sendFax(String message) {
                System.out.println("Sending another message " + message);
            }
        };
        fd.sendFax("test");

        Device d = new Device() {
            @Override
            public void doCopy() {
                System.out.println("copying...");
            }
        };
        LengthCounter lengthCounter = new LengthCounter() {
            private String internalString = "42";

            @Override
            public int count(String string) {
                System.out.println("Hello world " + string);
                return string.length() + internalString.length();
            }
        };

        LengthCounter lengthCounter1 = s -> s.length();

        lengthCounter1.count("test");
        //a>b if a.length()>b.length()
        Comparator<String> c2 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
            }
        };
        String a1 = "1234";
        String b1 = "123";
        Comparator<String> c3 = Comparator.comparing(a -> Integer.valueOf(a.length()));
        System.out.println(c3.compare(a1, b1));
        System.out.println(c2.compare(a1, b1));
    }
}
