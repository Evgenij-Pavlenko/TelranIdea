import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1.hashCode() > o2.hashCode()) return 1;
                if (o1.hashCode() < o2.hashCode()) return -1;
                return 0;
            }
        };
    }
}
