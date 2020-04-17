package telran.secretNumber20200416;

import java.util.Scanner;

public class GuessNumberGame {
    // there is a secrete number: 1...10
    //there are 3 attempts
    //
    // Pattern State, но как-то коряво(
    int numberPC = (int) (Math.random() * 10);
    int attempt = 3;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumberGame m = new GuessNumberGame();

        m.methodHello();
        m.enterNumber();

    }

    public void methodHello() {
        System.out.println("Hello, enter number 1..10.");
    }

    public void enterNumber() {
        while (attempt > 0) {
            System.out.printf("You have %d attempts:\n", attempt);
            int enteredInt = sc.nextInt();
            if (enteredInt == numberPC) {
                System.out.println("Bingo!");
                break;
            }
            if (compareTwoInts(enteredInt, numberPC)) {
                new LargerState().compare(enteredInt);
            } else {
                new SmallerState().compare(enteredInt);
            }
            attempt--;
        }
    }
    // это лишнее - можно сразу if(a>b) писать
    public boolean compareTwoInts(int a, int b) {
        return a > b ? true : false;
    }
}
