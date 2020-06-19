public class Demo {
    public static void main(String[] args) {
        String action = "PREVIEW";

        ImageActionFactory factory = new ImageActionFactory();

        Process process = new Process(action, factory);

        process.execute();

    }
}
