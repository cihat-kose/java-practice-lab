package _23_ClassMethods._02_PersonRegistry;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonRegistry {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        // Person nesnelerini saklamak için bir ArrayList oluşturuluyor
        ArrayList<Person> persons = new ArrayList<>();

        // Kullanıcıdan veri almak için döngü başlatılıyor
        while (devam) {
            System.out.println("1. Yeni kişi ekle ");
            System.out.println("2. Kişileri Yazdır ");
            System.out.println("3. Çıkış ");
            System.out.print("Seçim : ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Tampon temizleme

            switch (secim) {
                case 1:
                    // Kullanıcıdan kişi bilgileri alınıyor
                    System.out.print("Kişi Adı : ");
                    String name = scanner.nextLine();
                    System.out.print("Kişi Yaşı : ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Tampon temizleme
                    System.out.print("Hobileri (virgülle ayırarak girin) : ");
                    String hobbiesStr = scanner.nextLine();
                    String[] hobbies = hobbiesStr.split(",");

                    // Yeni bir Person nesnesi oluşturuluyor
                    Person person = new Person();
                    person.name = name; // name değişkenine doğrudan değer atama
                    person.age = age; // age değişkenine doğrudan değer atama
                    person.hobbies = hobbies; // hobbies değişkenine doğrudan değer atama
                    persons.add(person); // Kişi listeye eklenir
                    break;
                case 2:
                    // Tüm kişilerin bilgileri yazdırılıyor
                    for (Person person1 : persons) {
                        person1.displayInfo();
                    }
                    break;
                case 3:
                    // Program sonlandırılıyor
                    devam = false;
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim lütfen tekrar deneyiniz");
                    break;
            }
        }

        scanner.close(); // Scanner nesnesi kapatılıyor
    }
}
