package _08_ArithmeticOperators;

public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        int sayi1 = 8;
        int sayi2 = 3;

        // Toplama Operatörü (+)
        int toplam = sayi1 + sayi2;
        System.out.println("Toplama: " + sayi1 + " + " + sayi2 + " = " + toplam);

        // Çıkarma Operatörü (-)
        int fark = sayi1 - sayi2;
        System.out.println("Çıkarma: " + sayi1 + " - " + sayi2 + " = " + fark);

        // Çarpma Operatörü (*)
        int carpim = sayi1 * sayi2;
        System.out.println("Çarpma: " + sayi1 + " * " + sayi2 + " = " + carpim);

        // Bölme Operatörü (/)
        int bolum = sayi1 / sayi2; // Tamsayı bölme
        System.out.println("Bölme (tamsayı): " + sayi1 + " / " + sayi2 + " = " + bolum);

        double bolum2 = (double) sayi1 / sayi2; // Ondalıklı bölme
        System.out.println("Bölme (ondalıklı): " + sayi1 + " / " + sayi2 + " = " + bolum2);

        // Mod Operatörü (%)
        int kalan = sayi1 % sayi2;
        System.out.println("Mod: " + sayi1 + " % " + sayi2 + " = " + kalan);

        // Artırma Operatörü (++)
        sayi1++;
        System.out.println("Artırma: sayi1++ = " + sayi1);

        // Azaltma Operatörü (--)
        sayi1--;
        System.out.println("Azaltma: sayi1-- = " + sayi1);

        // Ön Artırma ve Sonra Artırma Farkı
        System.out.println("Önce artırma: ++sayi1 = " + (++sayi1)); // Artır, sonra yazdır
        System.out.println("Sonra artırma: sayi1++ = " + (sayi1++)); // Yazdır, sonra artır
        System.out.println("Son durum: sayi1 = " + sayi1);

        // Operatör Önceliği
        int sonuc = sayi1 + sayi2 * 2;  // Çarpma, toplamanın önceliğine sahiptir
        System.out.println("Operatör önceliği (sayi1 + sayi2 * 2): " + sonuc);

        int duzeltilmisSonuc = (sayi1 + sayi2) * 2;  // Önceliği değiştirmek için parantez kullanılır
        System.out.println("Öncelik parantez ile değiştirildi: (sayi1 + sayi2) * 2 = " + duzeltilmisSonuc);
    }
}
