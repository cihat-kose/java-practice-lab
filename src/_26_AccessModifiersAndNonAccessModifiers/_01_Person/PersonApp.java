package _26_AccessModifiersAndNonAccessModifiers._01_Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();

        // Public değişkene erişim
        System.out.println("Public Name: " + person.publicName);

        // Private değişken: Erişilemez, derleme hatası alırsınız.
        // System.out.println("Private Age: " + person.privateAge);

        // Protected değişkene erişim (Aynı paket içinde olduğu için erişilebilir)
        System.out.println("Protected Gender: " + person.protectedGender);

        // Default değişkene erişim (Aynı paket içinde olduğu için erişilebilir)
        System.out.println("Default Address: " + person.defaultAddress);
    }
}
