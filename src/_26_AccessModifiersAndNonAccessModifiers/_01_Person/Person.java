package _26_AccessModifiersAndNonAccessModifiers._01_Person;

public class Person {
    public String publicName = "Hakan"; // Her yerden erişilebilir
    private int privateAge = 30; // Sadece bu sınıf içinden erişilebilir
    protected String protectedGender = "Male"; // Aynı paket ve alt sınıflardan erişilebilir
    String defaultAddress = "123 Main St"; // Sadece aynı paket içinden erişilebilir
}
