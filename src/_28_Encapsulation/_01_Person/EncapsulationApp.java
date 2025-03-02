package _28_Encapsulation._01_Person;

public class EncapsulationApp {
    public static void main(String[] args) {
        // Person nesnesi oluşturuluyor
        Person person = new Person();

        // Ad bilgisi atanıyor
        person.name = "Hazar";

        // Yaş bilgisi güvenli bir şekilde atanıyor
        person.setAge(30);

        // Kişinin bilgileri ekrana yazdırılıyor
        System.out.println("Kişinin adı: " + person.name);
        System.out.println("Kişinin yaşı: " + person.getAge());

        // Negatif yaş girme senaryosu
        person.setAge(-5); // Hata mesajı vermeli
    }
}
