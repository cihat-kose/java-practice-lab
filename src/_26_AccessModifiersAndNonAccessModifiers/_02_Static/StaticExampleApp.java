package _26_AccessModifiersAndNonAccessModifiers._02_Static;

public class StaticExampleApp {
    public static void main(String[] args) {
        // Static değişken: Sınıf adı üzerinden erişim
        System.out.println("Static Variable: " + StaticExample.staticVar);

        // Static metot: Sınıf adı üzerinden çağırma
        StaticExample.staticMethod();
    }
}
