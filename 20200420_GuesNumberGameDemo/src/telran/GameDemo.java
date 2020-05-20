package telran;

public class GameDemo {
    public static void main(String[] args) {
        Game g = new Game(3,5, new ConsoleGameMessenger(), new ConsoleGameNumberReader());
        g.play();

    }
}
