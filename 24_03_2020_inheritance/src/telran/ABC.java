package telran;

public class ABC {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ab = new B();

        a = b;
        System.out.println(a);
        a = (B)a;
//        ab = (B)ab;

//        System.out.println(c instanceof B);
//        System.out.println(c.getClass().getSuperclass().getSuperclass().getSuperclass());
//        c.printC();
//        System.out.println();
//        c.printB();
//        System.out.println();
//        c.printA();
    }
}
