package _31_Interface._01_Printable;

// Document sınıfı, Printable interface'ini implement eder
public class Document implements IPrintable {

    // Printable interface'inin print() metodunu override ediyoruz
    @Override
    public void print() {
        System.out.println("Document is being printed.");
    }
}
