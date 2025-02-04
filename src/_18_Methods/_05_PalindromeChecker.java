package _18_Methods;

/**
 * Görev:
 * Bir stringin palindrom olup olmadığını kontrol eden bir metot yazınız.
 *
 * Palindrom Nedir?
 * - Bir kelime veya cümle, tersten okunduğunda da aynı kalıyorsa palindromdur.
 * - Örnek palindrom kelimeler: "radar", "level", "kayak", "madam".
 * - Boşluklar ve büyük/küçük harf duyarlılığı olmadan kontrol edilmelidir.
 */

public class _05_PalindromeChecker {

    /**
     * Verilen stringin palindrom olup olmadığını kontrol eden metot.
     *
     * @param str Kontrol edilecek string
     * @return Eğer string palindrom ise `true`, değilse `false`
     */
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String word = "Radar";
        boolean result = isPalindrome(word);

        System.out.println(word + " palindrom mu? " + result);
    }
}