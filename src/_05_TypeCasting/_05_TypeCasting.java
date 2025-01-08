package _05_TypeCasting;

public class _05_TypeCasting {

    public static void main(String[] args) {
        // Task 1: Double ➝ Int (Narrowing)
        // 🔢 Bir ondalık sayı (double) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.

        double ondalikSayi = 7.48;
        System.out.println("Ondalık Sayı (double) = " + ondalikSayi);

        // 🧑‍🎓 double değeri int tipine dönüştürüyoruz (kesir kısmı atılır).
        int tamSayi = (int) ondalikSayi;
        System.out.println("Tam Sayı (int) = " + tamSayi);


        // Task 2: Int ➝ Double (Widening)
        // 🔢 Bir tam sayı (int) tanımlayın ve bu değeri ondalık sayı (double) veri tipine dönüştürüp ekrana yazdırın.

        int tamSayi2 = 748;
        System.out.println("Tam Sayı (int) = " + tamSayi2);

        // 🔄 int değeri otomatik olarak double tipine dönüştürülür (genişletme).
        double ondalikSayi2 = tamSayi2;
        System.out.println("Ondalık Sayı (double) = " + ondalikSayi2);


        // Task 3: Float ➝ Int (Narrowing)
        // 🔢 Bir ondalık sayı (float) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.

        float floatSayi = 1.2F;
        System.out.println("Ondalık Sayı (float) = " + floatSayi);

        // 🧑‍🎓 float değeri int tipine dönüştürülüyor (kesir kısmı atılır).
        int intSayi3 = (int) floatSayi;
        System.out.println("Tam Sayı (int) = " + intSayi3);


        // Task 4: String ➝ Int (Parsing)
        // 📝 Bir metin (String) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.

        String sayiStr = "123";
        System.out.println("String Sayı (String) = " + sayiStr);

        // 🧑‍🎓 String değeri int tipine dönüştürülüyor (parseInt kullanılır).
        int intSayi4 = Integer.parseInt(sayiStr);
        System.out.println("Tam Sayı (int) = " + intSayi4);


        // Task 5: Int ➝ String (String.valueOf)
        // 🔢 Bir tam sayıyı (int) String'e dönüştürün ve ekrana yazdırın.

        int sayi = 456;
        System.out.println("Tam Sayı (int) = " + sayi);

        // 🧑‍🎓 int değeri String tipine dönüştürülüyor (valueOf kullanılır).
        String strSayi = String.valueOf(sayi);
        System.out.println("Tam Sayının String Hali (String) = " + strSayi);
    }
}
