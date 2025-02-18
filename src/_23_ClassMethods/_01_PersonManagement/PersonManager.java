package _23_ClassMethods._01_PersonManagement;

public class PersonManager {
    public static void main(String[] args) {
        // Yeni bir Person nesnesi oluşturuluyor
        Person person = new Person();

        // Person nesnesinin değişkenlerine değer atama
        person.name = "John Doe";
        person.age = 25;

        // displayInfo metodu ile kişinin bilgilerini yazdırma
        person.displayInfo();
    }
}