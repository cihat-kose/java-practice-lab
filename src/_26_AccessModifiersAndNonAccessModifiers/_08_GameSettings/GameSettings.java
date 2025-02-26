package _26_AccessModifiersAndNonAccessModifiers._08_GameSettings;

public class GameSettings {
    private static int score = 0; // Private static değişken: Sadece bu sınıf içinden erişilebilir

    public static void increaseScore() { // Public static metot: Skor değerini artırır
        score++;
    }

    public static int getScore() { // Public static metot: Skor değerini döndürür
        return score;
    }
}
