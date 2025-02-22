package _25_Constructor._02_Book;

public class Book {
    private String name;    // Kitabın ismi
    private String author;  // Kitabın yazarı
    private int pageCount;  // Kitabın sayfa sayısı

    // Sayfa sayısı olmadan constructor (varsayılan sayfa sayısı 0)
    public Book(String name, String author) {
        this.name = (name == null || name.isEmpty()) ? "Bilinmiyor" : name;
        this.author = (author == null || author.isEmpty()) ? "Bilinmiyor" : author;
        this.pageCount = 0;
    }

    // Sayfa sayısı ile constructor
    public Book(String name, String author, int pageCount) {
        this.name = (name == null || name.isEmpty()) ? "Bilinmiyor" : name;
        this.author = (author == null || author.isEmpty()) ? "Bilinmiyor" : author;
        this.pageCount = pageCount;
    }

    // Kitap bilgilerini ekrana yazdıran metot
    public void displayInfo() {
        System.out.println("Kitap İsmi: " + this.name);
        System.out.println("Yazar: " + this.author);
        System.out.println("Sayfa Sayısı: " + this.pageCount);
    }
}
