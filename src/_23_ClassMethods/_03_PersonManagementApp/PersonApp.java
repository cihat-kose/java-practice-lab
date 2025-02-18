package _23_ClassMethods._03_PersonManagementApp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * PersonApp sınıfı, kullanıcıdan kişi bilgileri alarak listeye ekleyen
 * ve isteğe bağlı olarak girilen bilgileri yazdıran bir uygulamadır.
 */
public class PersonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;
        ArrayList<Person> persons = new ArrayList<>();

        while (devam) {
            System.out.println("1. Yeni kişi ekle");
            System.out.println("2. Kişileri Yazdır");
            System.out.println("3. Çıkış");
            System.out.print("Seçim: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Kişi Adı: ");
                    String name = scanner.nextLine();
                    System.out.print("Kişi Yaşı: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Hobileri (virgülle ayırarak girin): ");
                    String hobbiesStr = scanner.nextLine();
                    String[] hobbies = hobbiesStr.split(",");

                    // Yeni kişi nesnesi oluşturulup listeye ekleniyor
                    Person person = new Person();
                    person.name = name;
                    person.age = age;
                    person.hobbies = hobbies;
                    persons.add(person);
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
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyiniz.");
                    break;
            }
        }
        scanner.close();
    }
}