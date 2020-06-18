import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PrintFile {
    public static void main(String[] args) {
        if (args.length!=1){
            System.out.println("Specify a file name");
            return;
        }
        String fileName = args[0];

        System.out.println("Oppening file: " + fileName);
        System.out.println("Hello world");
        try {
            Stream<String> lines = Files.lines(Paths.get(fileName));
lines.forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        }
    }
}
