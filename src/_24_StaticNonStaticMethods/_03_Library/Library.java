package _24_StaticNonStaticMethods._03_Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>(); // Kitapları tutan liste
    private static int totalBookCount = 0; // Toplam kitap sayısını tutan statik değişken

    // Kütüphaneye kitap ekleyen non-static metot
    public void addBook(Book book) {
        books.add(book);
        totalBookCount++;
    }

    // Kütüphaneden kitap çıkaran non-static metot
    public void removeBook(Book book) {
        if (books.remove(book)) {
            totalBookCount--;
        }
    }

    // Kütüphanedeki toplam kitap sayısını döndüren static metot
    public static int getTotalBookCount() {
        return totalBookCount;
    }
}
