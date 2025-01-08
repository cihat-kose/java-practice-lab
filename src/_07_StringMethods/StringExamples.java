package _07_StringMethods;

public class StringExamples {

    public static void main(String[] args) {
        String greeting = "Merhaba";

        // toLowerCase(): Tüm harfleri küçük harfe çevirir.
        String toLowerCase = greeting.toLowerCase();
        System.out.println("Kucuk Harf = " + toLowerCase);

        // toUpperCase(): Tüm harfleri büyük harfe çevirir.
        String toUpperCase = greeting.toUpperCase();
        System.out.println("Buyuk Harf = " + toUpperCase);

        // concat(): İki stringi birleştirir
        String str1 = "Merhaba";
        String str2 = "Dunya";
        String space = " ";

        String combined = str1.concat(space).concat(str2);
        System.out.println("Birlesik = " + combined);

        // indexOf(): Alt dizenin ilk bulunduğu indeksi döner. Bulamazsa -1 döner.
        String sample1 = "Merhaba Dunya!";
        int firstIndex = sample1.indexOf("a");
        System.out.println("Ilk 'a' indeksi = " + firstIndex);

        int secondIndex = sample1.indexOf("a", firstIndex + 1);
        // int secondIndex2 = sample1.indexOf("a", 5);
        System.out.println("Ikinci 'a' indeksi = " + secondIndex);

        // -1 dönüş değeri örneği
        int notFoundIndex = sample1.indexOf("z");
        System.out.println("Bulunamayan harf indeksi = " + notFoundIndex);
        if (notFoundIndex == -1) {
            System.out.println("'z' karakteri bulunamadi.");
        }

        // lastIndexOf(): Bir alt dizenin son bulunduğu indeksi döner
        String sample2 = "Merhaba Dunya Merhaba Java 23";
        int lastIndex = sample2.lastIndexOf("Merhaba");
        System.out.println("Son 'merhaba' indeksi = " + lastIndex);

        // isEmpty(): String boşsa true döner.
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.println("Bos mu? = " + isEmpty);
        System.out.println("sample2.isEmpty() = " + sample2.isEmpty());

        // trim(): Baş ve sondaki boşlukları temizler
        String textWithSpaces = "     Merhaba, Bu bir örnek!    ";
        String trimmed = textWithSpaces.trim();
        System.out.println("Trimlenmis hali = " + trimmed);

        // contains(): Alt dize içerip içermediğini kontrol eder
        String sampleContains = "Merhaba, bu bir contains örneğidir!";
        boolean containsExample = sampleContains.contains("örneğidir!");
        System.out.println("Iceriyor mu = " + containsExample);

        // equals() ve equalsIgnoreCase(): String karşılaştırma
        String string1 = "Merhaba";
        String string2 = "MERHABA";

        boolean isEqual = string1.equals(string2);
        boolean isEqualIgnoreCase = string1.equalsIgnoreCase(string2);

        System.out.println("Birebir eşit mi? = " + isEqual);
        System.out.println("Büyük-küçük harf duyarsız eşit mi? = " + isEqualIgnoreCase);

        // length(): String uzunluğunu döner
        int length = string1.length();
        System.out.println("string1 uzunlugu = " + length);

        // charAt(): Belirli bir indeksdeki karakteri döner
        char firstChar = string1.charAt(0);
        char lastChar = string1.charAt(string1.length() - 1);
        // char lastChar2 = string1.charAt(6);

        System.out.println("Ilk karakter = " + firstChar);
        System.out.println("Son karakter = " + lastChar);

        // String string1 = "Merhaba";
        // substring(): Alt dize döner
        String subString1 = string1.substring(3); // haba
        String subString2 = string1.substring(0, 3); // Mer

        System.out.println("Alt dize 1 = " + subString1);
        System.out.println("Alt dize 2 = " + subString2);

        // startsWith() ve endsWith(): Başlangıç ve bitiş kontrolü
        boolean startsWith = string1.startsWith("Mer");
        boolean endsWith = string1.endsWith("haba");
        System.out.println("Mer ile başlıyor mu? = " + startsWith);
        System.out.println("haba ile bitiyor mu? = " + endsWith);

        // replace() ve replaceAll() - Regex kullanımı
        String textToReplace = "Merhaba123 dünya! Bu bir 456 örnek cümle.";

        // Regex kullanarak sadece harfleri ve boşlukları tut, geri kalan her şeyi temizle
        // [^a-zA-Zğüşöçİı ]: a-z, A-Z ve Türkçe karakterler dışındaki her şeyi eşleştir
        // ^: Negation (DEĞİL) anlamına gelir, yani köşeli parantez içindeki karakterler dışındakiler seçilir
        // a-zA-Z: İngilizce küçük ve büyük harfler
        // ğüşöçİı: Türkçe harfler
        // Boşluk da eklenerek, yalnızca harfler ve boşluklar korunur
        // Örneğin: "Merhaba123 dünya!" -> "Merhaba dünya"
        String onlyWords = textToReplace.replaceAll("[^a-zA-Zğüşöçİı ]", "");
        System.out.println("Sadece kelimeler = " + onlyWords);

        // Tüm 'a' harflerini 'X' ile değiştir
        String replacedChars = textToReplace.replace('a', 'X');
        System.out.println("Karakter değişimi = " + replacedChars);

        // İlk eşleşen 'Merhaba' ifadesini 'Selam' ile değiştir
        String firstReplace = textToReplace.replaceFirst("Merhaba", "Selam");
        System.out.println("İlk değişim = " + firstReplace);
    }
}
