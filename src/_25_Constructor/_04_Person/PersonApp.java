package _25_Constructor._04_Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        // Kullanıcıdan sürekli olarak kişi bilgileri alınır
        while (true) {
            System.out.print("Adınızı girin: ");
            String name = scanner.nextLine();

            System.out.print("Yaşınızı girin: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Yeni satır karakterini temizler

            System.out.print("Hobilerinizi girin (virgülle ayırarak): ");
            String hobbiesInput = scanner.nextLine();
            List<String> hobbies = new ArrayList<>();
            for (String hobby : hobbiesInput.split(",")) {
                if (!hobby.trim().isEmpty()) {
                    hobbies.add(hobby.trim());
                }
            }

            // Kişi nesnesi oluşturulup listeye eklenir
            Person person = new Person(name, age, hobbies);
            people.add(person);

            System.out.print("Başka bir kişi eklemek ister misiniz? (evet/hayır): ");
            String continueInput = scanner.nextLine();
            if (continueInput.equalsIgnoreCase("hayır")) {
                break;
            }
        }

        // Girilen tüm kişilerin bilgileri ekrana yazdırılır
        System.out.println("\nGirilen tüm kişiler:");
        for (Person person : people) {
            person.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}
