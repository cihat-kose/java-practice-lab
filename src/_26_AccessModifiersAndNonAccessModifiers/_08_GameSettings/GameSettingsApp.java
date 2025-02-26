package _26_AccessModifiersAndNonAccessModifiers._08_GameSettings;

public class GameSettingsApp {
    public static void main(String[] args) {
        // Skoru artır
        GameSettings.increaseScore();
        GameSettings.increaseScore();

        // Skor değerini ekrana yazdır
        System.out.println("Score: " + GameSettings.getScore());
    }
}
