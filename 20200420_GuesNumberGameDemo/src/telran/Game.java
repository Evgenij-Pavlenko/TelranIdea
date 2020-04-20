package telran;

public class Game {
    private int attempts;
    private int secret; // число, которое нужно угадать
    private GameMessenger messenger; // Inversion of Control (IoC)
    private GameNumberRider reader;

    public Game(int attempts, int secret, GameMessenger messeger, GameNumberRider reader) {
        this.attempts = attempts;
        this.secret = secret;
        this.messenger = messeger;
        this.reader = reader;

    }


    public void play() {
        doGreatings();
        boolean guess = guess();
        showGameOver(guess);
    }

    private boolean guess() {
        boolean guessedCorrecctly = false;
        while (attempts > 0 && !guessedCorrecctly) {
            int guessedNumber = reader.getGuessedNumber();
            if (guessedNumber == secret) {
                guessedCorrecctly = true;
            } else {
                doTryAgane();
            }
            attempts--;
        }
        return guessedCorrecctly;
    }

    private void showGameOver(boolean guesedCorrecctly) {
        if (!guesedCorrecctly) {
            doYouLose();
        } else {
            doYouWin();
        }

    }

    private void doGreatings() {
        messenger.print("Welcome to the game! Guess a number");
    }

    private void doYouWin() {
        messenger.print("Congrats! You won!");
    }

    private void doYouLose() {
        messenger.print("You lose!");
    }

    private void doTryAgane() {
        messenger.print("Wrong number, try again!");
    }

}
