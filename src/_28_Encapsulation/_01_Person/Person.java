package _28_Encapsulation._01_Person;

public class Person {
    public String name;  // Adı public olarak tanımlandı
    private int age;     // Yaş private olarak kapsüllendi

    // Getter metodu: age değerini döndürür
    public int getAge() {
        return age;
    }

    // Setter metodu: age değerini güvenli bir şekilde ayarlar
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Hata: Yaş negatif olamaz!");
        }
    }
}
