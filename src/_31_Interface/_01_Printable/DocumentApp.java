package _31_Interface._01_Printable;

public class DocumentApp {
    public static void main(String[] args) {
        // Printable interface'i üzerinden Document nesnesi oluşturuluyor
        IPrintable document = new Document();

        // print() metodunu çağırma
        document.print(); // Çıktı: Document is being printed.
    }
}
