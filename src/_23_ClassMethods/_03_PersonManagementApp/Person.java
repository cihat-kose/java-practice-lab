package _23_ClassMethods._03_PersonManagementApp;

/**
 * Person sınıfı, bir kişinin adını, yaşını ve hobilerini saklayan basit bir veri yapısıdır.
 * Kişinin bilgilerini ekrana yazdırmak için displayInfo metodunu içerir.
 */
public class Person {
    String name;
    int age;
    String[] hobbies;

    /**
     * Kişi bilgilerini ekrana yazdıran metot.
     */
    public void displayInfo() {
        System.out.println("Ad: " + this.name);
        System.out.println("Yaş: " + this.age);
        System.out.print("Hobiler: ");
        for (String hobby : this.hobbies) {
            System.out.print(hobby.trim() + " ");
        }
        System.out.println();
    }
}
