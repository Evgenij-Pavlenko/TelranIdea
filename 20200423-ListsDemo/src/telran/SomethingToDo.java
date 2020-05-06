package telran;

public class SomethingToDo {

    int a;
    int b;

    public SomethingToDo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    private class SomethingToDoTest {
        public void test() {
            System.out.println(3 == sum());
        }

    }

    public static void main(String[] args) {
        SomethingToDo s = new SomethingToDo(1, 2);
        SomethingToDoTest somethingToDoTest = s.new SomethingToDoTest();
        somethingToDoTest.test();
    }
}
