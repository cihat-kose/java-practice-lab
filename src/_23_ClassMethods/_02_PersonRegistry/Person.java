package _23_ClassMethods._02_PersonRegistry;

public class Person {
    // Kişinin adı, yaşı ve hobileri için değişkenler tanımlanıyor
    String name;
    int age;
    String[] hobbies;

    // Kişi bilgilerini ekrana yazdırmak için displayInfo metodu
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
