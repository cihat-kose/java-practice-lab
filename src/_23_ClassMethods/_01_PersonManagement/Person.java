package _23_ClassMethods._01_PersonManagement;

public class Person {
    // Kişinin adı ve yaşı için değişkenler tanımlanıyor
    String name;
    int age;

    // Kişi bilgilerini ekrana yazdırmak için displayInfo metodu
    public void displayInfo() {
        System.out.println("Ad: " + this.name);
        System.out.println("Yaş: " + this.age);
    }
}