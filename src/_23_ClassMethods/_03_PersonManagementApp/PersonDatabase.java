package _23_ClassMethods._03_PersonManagementApp;

import java.util.ArrayList;

/**
 * PersonDatabase sınıfı, kişileri saklamak ve yönetmek için kullanılan bir veri yapısıdır.
 * Kişi ekleme ve listeleme işlevlerini içerir.
 */
public class PersonDatabase {
    private ArrayList<Person> persons;

    /**
     * Constructor: Yeni bir kişi veritabanı oluşturur.
     */
    public PersonDatabase() {
        this.persons = new ArrayList<>();
    }

    /**
     * Yeni bir kişi ekler.
     * @param person Eklenmek istenen kişi nesnesi
     */
    public void addPerson(Person person) {
        persons.add(person);
    }

    /**
     * Tüm kişileri ekrana yazdırır.
     */
    public void displayAllPersons() {
        if (persons.isEmpty()) {
            System.out.println("Veritabanında kişi bulunmamaktadır.");
        } else {
            for (Person person : persons) {
                person.displayInfo();
            }
        }
    }

    /**
     * Ada göre kişi arar.
     * @param name Aranacak kişi adı
     * @return Eşleşen kişiler listesi
     */
    public ArrayList<Person> searchPersonByName(String name) {
        ArrayList<Person> foundPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.name.equalsIgnoreCase(name)) {
                foundPersons.add(person);
            }
        }
        return foundPersons;
    }
}