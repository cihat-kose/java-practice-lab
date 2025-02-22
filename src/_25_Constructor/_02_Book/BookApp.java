package _25_Constructor._02_Book;

public class BookApp {
    public static void main(String[] args) {
        // Varsayılan sayfa sayısı ile bir kitap nesnesi oluşturma
        Book book1 = new Book("Kürk Mantolu Madonna", "Sabahattin Ali");
        book1.displayInfo();

        System.out.println(); // Boş satır

        // Belirtilen sayfa sayısı ile bir kitap nesnesi oluşturma
        Book book2 = new Book("Saatleri Ayarlama Enstitüsü", "Ahmet Hamdi Tanpınar", 382);
        book2.displayInfo();
    }
}
