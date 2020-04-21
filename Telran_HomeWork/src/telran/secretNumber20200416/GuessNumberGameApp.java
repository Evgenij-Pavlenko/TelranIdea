package telran.secretNumber20200416;

public class GuessNumberGameApp {
    public static void main(String[] args) {
        GuessNumberGame g = new GuessNumberGame(3, (int) (Math.random()*11), new ConsoleGameMessenger(), new ConsoleNumberReader());
        g.play();
    }
}
