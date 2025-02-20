package _24_StaticNonStaticMethods._03_Library;

public class LibraryApp {
    public static void main(String[] args) {
        // Library sınıfından bir nesne oluşturma
        Library library = new Library();

        // Kitap nesneleri oluşturma
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Kütüphaneye kitap ekleme
        library.addBook(book1);
        library.addBook(book2);

        // Toplam kitap sayısını yazdırma
        System.out.println("Toplam kitap sayısı: " + Library.getTotalBookCount()); // 2

        // Kütüphaneden kitap çıkarma
        library.removeBook(book1);

        // Toplam kitap sayısını tekrar yazdırma
        System.out.println("Toplam kitap sayısı: " + Library.getTotalBookCount()); // 1
    }
}
