package _06_Scanner;

import java.util.Scanner;

public class _07_SwapNumbers {

    public static void main(String[] args) {

        /**
            Kullanıcıdan iki tamsayı değer alıp, üçüncü bir değişken kullanarak
            ve üçüncü bir değişken kullanmadan olmak üzere
            iki farklı şekilde alınan değerleri değiştiren programı yazınız.
         */

        Scanner input = new Scanner(System.in);

        // Üçüncü bir değişken kullanarak değişim
        System.out.println("a) Üçüncü bir değişken kullanarak değiştirme:");

        System.out.print("Lütfen ilk değeri girin: ");
        int ilkDeger = input.nextInt();
        System.out.println("İlk Değer = " + ilkDeger);

        System.out.print("Lütfen ikinci değeri girin: ");
        int ikinciDeger = input.nextInt();
        System.out.println("İkinci Değer = " + ikinciDeger);

        // Üçüncü bir değişken kullanarak swap işlemi
        int geciciDeger = ilkDeger;
        ilkDeger = ikinciDeger;
        ikinciDeger = geciciDeger;

        System.out.println("Değerler üçüncü bir değişken kullanılarak değiştirildi:");
        System.out.println("Değiştirilmiş ilk değer: " + ilkDeger);
        System.out.println("Değiştirilmiş ikinci değer: " + ikinciDeger);

        System.out.println("************************************************************");

        // Üçüncü bir değişken olmadan değişim
        System.out.println("b) Üçüncü bir değişken kullanmadan değiştirme:");

        System.out.print("Lütfen ilk değeri girin: ");
        ilkDeger = input.nextInt();
        System.out.println("İlk Değer = " + ilkDeger);

        System.out.print("Lütfen ikinci değeri girin: ");
        ikinciDeger = input.nextInt();
        System.out.println("İkinci Değer = " + ikinciDeger);

        // Üçüncü bir değişken olmadan swap işlemi
        ilkDeger = ilkDeger + ikinciDeger;
        ikinciDeger = ilkDeger - ikinciDeger;
        ilkDeger = ilkDeger - ikinciDeger;

        System.out.println("Değerler üçüncü bir değişken kullanılmadan değiştirildi:");
        System.out.println("Değiştirilmiş ilk değer: " + ilkDeger);
        System.out.println("Değiştirilmiş ikinci değer: " + ikinciDeger);
    }
}
