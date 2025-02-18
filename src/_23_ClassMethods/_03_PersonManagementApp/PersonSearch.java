package _23_ClassMethods._03_PersonManagementApp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * PersonSearch sınıfı, kullanıcıdan bir isim alarak kişi listesinde
 * arama yapar ve eşleşen kişilerin bilgilerini ekrana yazdırır.
 */
public class PersonSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        // Örnek veriler ekleme
        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 30;
        p1.hobbies = new String[]{"Yüzme", "Kitap Okuma"};
        persons.add(p1);

        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 25;
        p2.hobbies = new String[]{"Koşu", "Film İzleme"};
        persons.add(p2);

        System.out.print("Aramak istediğiniz kişinin adını girin: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (Person person : persons) {
            if (person.name.equalsIgnoreCase(searchName)) {
                person.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Bu isimde bir kişi bulunamadı.");
        }

        scanner.close();
    }
}
