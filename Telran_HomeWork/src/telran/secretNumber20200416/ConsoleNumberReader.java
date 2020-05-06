package telran.secretNumber20200416;

import java.util.Scanner;

public class ConsoleNumberReader implements NumberReader {

   private Scanner scanner = new Scanner(System.in);

    @Override
    public int read() {
        return scanner.nextInt();
    }
}
