package _32_AbstractClass._02_TextFile;

public class TextFileApp {
    public static void main(String[] args) {
        // TextFile sınıfından bir nesne oluşturma
        TextFile file = new TextFile();

        // Metotları çağırarak çıktıyı görüntüleme
        file.read();  // Çıktı: Reading the text file...
        file.write(); // Çıktı: Writing to the text file...
    }
}
