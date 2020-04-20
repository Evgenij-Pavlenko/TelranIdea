package telran.secretNumber20200416;

import java.util.Scanner;

public class GuessNumberGame {
    // there is a secrete number: 1...10
    //there are 3 attempts
    //
    // Pattern State, но как-то коряво(
    private int attempt;
    private int numberPC;
    private GameMessenger gameMessenger;
    private NumberReader numberReader;
    private int enteredInt;

    public GuessNumberGame(int attempt, int numberPC, GameMessenger gameMessenger, NumberReader numberReader) {
        this.attempt = attempt;
        this.numberPC = numberPC;
        this.gameMessenger = gameMessenger;
        this.numberReader = numberReader;
    }



    public void play() {
        doHello();
//        boolean guess = guessNumber(); //открытое (package) объявление переменной, лучше сразу в метод вставить?
        showGameEnd(guessNumber());
    }

    private boolean guessNumber() {
        while (attempt > 0 ) {
            doAttempts(attempt);
            enteredInt = numberReader.read();
            if (enteredInt == numberPC) {
                return true;
            }
            attempt--;
            compareNumber();
        }
        return false;
    }

    private void showGameEnd(boolean gues) {
        if (gues) {
            doWon();
        } else {
            doLose();
        }
    }

    private void doHello() {
        gameMessenger.print("Hello, enter number 1..10.");
    }

    private void doAttempts(int attempt) {
        gameMessenger.print("You have " + attempt + " attempts:");

    }

    private void doWon() {
        gameMessenger.print("You won, lucky!");
    }

    private void doLose() {
        gameMessenger.print("You lose :(");
    }

    private void compareNumber() {
        if (enteredInt > numberPC) {
            new LargerState().compare(enteredInt);
        } else {
            new SmallerState().compare(enteredInt);
        }
    }

}
