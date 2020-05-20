package telran.secretNumber20200416;

import java.util.Scanner;

public class GuessNumberGamePC {
    int myNumber;
    int attempt = 3;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumberGamePC m = new GuessNumberGamePC();

        m.methodHello();
        m.guessNumber();

    }

    public void methodHello() {
        System.out.println("Hello, my number is: ");
        myNumber = sc.nextInt();
    }

    public void guessNumber() {
        int numberPC = (int) (Math.random()*11);
        while (attempt > 0) {
            System.out.printf("PC have %d attempts:\n", attempt);
            if (numberPC==myNumber) {
                System.out.println("Bingo!");
                break;
            }
            if (numberPC > myNumber) {
                new LargerState().compare(numberPC);
                System.out.println(numberPC);
                numberPC = (int) (Math.random() * numberPC);
            } else {
                new SmallerState().compare(numberPC);
                System.out.println(numberPC);
                numberPC = (int) (Math.random() * (10 - numberPC) + numberPC);
            }
            attempt--;
        }
    }
}

