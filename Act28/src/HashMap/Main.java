package HashMap;

public class Main {
    public static void main(String[] args) {
        Hashmaps test = new Hashmaps();

        test.addToGame("Call Of Duty", "FPS");
        test.addToGame("Devil May Cry", "Hack and Slash");
        test.addToGame("Resident Evil", "Horror");

        test.displayGame();

        test.removeFromGame("Call Of Duty");

        test.displayGame();
    }
}
