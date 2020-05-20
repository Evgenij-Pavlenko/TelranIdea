package telran;

public class OuterDemo {
    public static String messege = "Hello World!";
    public String m2 = "test";

    public static class InnerDemo {
        public void print() {
            System.out.println(messege);
//            System.out.println(m2); - не может взять нестатическую переменную
        }
    }

    public static void main(String[] args) {
        OuterDemo o = new OuterDemo();


        OuterDemo.InnerDemo id = new InnerDemo(); //- в случае статического внутреннего класса

//        OuterDemo.InnerDemo id = o.new InnerDemo(); //- в случае нестатического внутреннего класса
        // практически не используется
    }
}
