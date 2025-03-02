Java Encapsulation (Kapsülleme)

1. Tanım:
   - Encapsulation, sınıfın verilerini (fields) ve bu verilerle ilişkili davranışları (methods) bir arada tutarak gizler.
   - Dış dünyadan erişimi kontrol eder ve sadece belirli yollarla verilerin değiştirilmesine izin verir.

2. Adımlar:
   - 1. Verileri Gizleme (Data Hiding):
     - Sınıfın özellikleri private olarak tanımlanır.
     - Dışarıdan doğrudan erişim engellenir.
   - 2. Erişim Sağlama:
     - Verilere erişmek ve onları güncellemek için public getter ve setter yöntemleri tanımlanır.
   - 3. Kontrol Sağlama:
     - Getter ve setter yöntemleri, verilerin güvenli bir şekilde erişilmesini ve değiştirilmesini sağlar.

3. Faydaları:
   - Güvenlik:
     - Veriler dış dünyadan korunur.
   - Esneklik:
     - Sınıfın iç yapısı değişse bile, dış dünyaya sunulan arayüz aynı kalabilir.
   - Bakım Kolaylığı:
     - Kodun daha kolay bakımını sağlar, çünkü değişiklikler sınıfın iç yapısını etkilemez.
   - Modülerlik:
     - Sınıfların modüler ve yeniden kullanılabilir olmasını sağlar.

4. Örnek:
   - Private Özellik:
     private int age;

   - Getter ve Setter Metotları:
     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         if (age > 0) {  // Kontrol Mekanizması
             this.age = age;
         }
     }

5. Kritik Noktalar:
   - Veri Bütünlüğü:
     - Setter metotlarıyla, verilerin doğruluğunu ve geçerliliğini kontrol edebilirsiniz.
   - Kullanıcı Dostu Arayüz:
     - Kullanıcılar sadece public arayüzlerle etkileşime girer, bu da kodun kullanımını kolaylaştırır.