public class Main {
    public static void main(String[] args) {
        Table table1  = new Table("black", 100, 100, 40);
        Table table2  = new Table("black", 100, 100, 40);
        Table table3  = new Table("braun", 120, 120, 70);

        System.out.println(table1 == table2);
        System.out.println(table1.equals(table2));
        System.out.println(table1);
        System.out.println(table1.hashCode());
    }
}
