package _26_AccessModifiersAndNonAccessModifiers._06_Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();
        // Private değişken doğrudan erişilemez, sadece public metod çağrılabilir
        person.printName();
    }
}
