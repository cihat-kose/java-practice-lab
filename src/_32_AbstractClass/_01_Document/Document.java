package _32_AbstractClass._01_Document;

public class Document extends DocumentBase {
    @Override
    public void print() {
        // Document sınıfı, print() metodunu kendi ihtiyaçlarına göre tanımlar
        System.out.println("Document is being printed.");
    }

    public static void main(String[] args) {
        Document document = new Document();
        document.print(); // Çıktı: Document is being printed.
    }
}
