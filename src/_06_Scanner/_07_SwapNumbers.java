package _06_Scanner;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan iki tamsayı alıp, üçüncü bir değişken kullanarak ve kullanmadan
değerleri değiştiren programı yazın.
*/
public class _07_SwapNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Üçüncü değişken kullanarak değişim
        System.out.println("a) Üçüncü bir değişken kullanarak değiştirme:");

        System.out.print("Lütfen ilk değeri girin: ");
        int ilkDeger = input.nextInt();

        System.out.print("Lütfen ikinci değeri girin: ");
        int ikinciDeger = input.nextInt();

        int geciciDeger = ilkDeger;
        ilkDeger = ikinciDeger;
        ikinciDeger = geciciDeger;

        System.out.println("İlk değer: " + ilkDeger);
        System.out.println("İkinci değer: " + ikinciDeger);

        System.out.println("************************************************************");

        // Üçüncü değişken olmadan değişim
        System.out.println("b) Üçüncü bir değişken kullanmadan değiştirme:");

        System.out.print("Lütfen ilk değeri girin: ");
        ilkDeger = input.nextInt();

        System.out.print("Lütfen ikinci değeri girin: ");
        ikinciDeger = input.nextInt();

        ilkDeger = ilkDeger + ikinciDeger;
        ikinciDeger = ilkDeger - ikinciDeger;
        ilkDeger = ilkDeger - ikinciDeger;

        System.out.println("İlk değer: " + ilkDeger);
        System.out.println("İkinci değer: " + ikinciDeger);
    }
}
