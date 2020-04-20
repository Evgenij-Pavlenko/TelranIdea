package telran;

import java.util.Scanner;

public class ConsoleGameNumberReader implements GameNumberRider {
    Scanner scanner = new Scanner(System.in);
    @Override
    public int getGuessedNumber() {
        return scanner.nextInt();
    }
}
