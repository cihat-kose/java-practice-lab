package _17_Arrays2D;

/**
 * Görev:
 * 3 farklı dersin 10'ar rastgele notunu içeren çok boyutlu bir dizi oluşturup içini doldurunuz ve notları ekrana yazdırınız.
 *
 * İpuçları:
 * 1. Tüm ders notlarını saklamak için bir 2 boyutlu dizi oluşturun. Bu dizi 3 satır ve 10 sütundan oluşmalıdır.
 * 2. İki adet döngü kullanarak, her bir dersin notlarını rastgele bir şekilde oluşturun ve ilgili dizilere kaydedin.
 *    İlk döngü dersleri, ikinci döngü notları temsil etmelidir.
 * 3. Her bir not oluşturulduğunda, ders ve not numarasını kullanarak ekrana yazdırın.
 *
 * Örnek Çıktı:
 * 1. ders 1. not= 85
 * 1. ders 2. not= 70
 * ...
 * 3. ders 10. not= 92
 */
public class _06_GradeGenerator {
    public static void main(String[] args) {
        // 3 ders ve her ders için 10 not içeren 2 boyutlu dizi tanımlanıyor
        int[][] allGrades = new int[3][10];

        // Her ders için rastgele notlar üretiliyor ve yazdırılıyor
        for (int lesson = 0; lesson < allGrades.length; lesson++) {
            for (int gradeIndex = 0; gradeIndex < allGrades[lesson].length; gradeIndex++) {
                int randomGrade = (int) (Math.random() * 101); // 0-100 arasında rastgele not üret
                allGrades[lesson][gradeIndex] = randomGrade;

                System.out.println((lesson + 1) + ". ders " + (gradeIndex + 1) + ". not= " + randomGrade);
            }
            System.out.println(); // Dersler arasında boşluk bırak
        }
    }
}
