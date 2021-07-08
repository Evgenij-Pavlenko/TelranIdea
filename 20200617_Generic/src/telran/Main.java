package telran;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box("hello!");

        System.out.println(b1);
        System.out.println(b2);

        String str = (String) b2.getBox();
        System.out.println(str);

//        Integer num = (Integer) b2.getBox(); // error!
//        System.out.println(num);

        if (b2.checkType().equals("Integer")){
            Integer num1 = (Integer) b2.getBox();
        }

        Box2<Integer> newB1 = new Box2<>(new Integer(10));
        Box2<String> newB2 = new Box2<>(new String("HI"));

        System.out.println(newB1);
        System.out.println(newB2);

//        newB2=newB1; // error разные типы

        Box3<Integer> numBox1 = new Box3<>(new Integer(10));
        Box3<Double> numBox2 = new Box3<>(new Double(10.3));
//        Box3<String> numBox3 = new Box3<>(new String("10.3")); // error
        System.out.println(numBox1);
        System.out.println(numBox2);
        System.out.println(numBox2);
        System.out.println("Sum Number: " + (numBox1.getBox() + numBox2.getBox()));
        Box3<Double> numBox4 = new Box3<>(new Double(10.3));
        numBox4.add(numBox4);
        System.out.println(numBox4);


    }
}
