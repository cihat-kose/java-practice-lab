package _02_EscapeSequences;

public class _02_EscapeSequences {

    public static void main(String[] args) {
        // 🎭 \n: Yeni satıra geçer
        System.out.println("Kahve içiyordum.\nBirden kapı çaldı.");

        // 🚪 \t: Tab boşluğu ekler (Düzeni sağlamak için birebir)
        System.out.println("Ürün\tAdet\tFiyat");
        System.out.println("Elma\t2\t20 TL");
        System.out.println("Portakal\t3\t30 TL");

        // 🔗 \\: Ters eğik çizgi ekler (Dosya yollarında kullanılır)
        System.out.println("C:\\Users\\Asus\\Desktop");

        // ✨ \": Çift tırnak ekler (Metin içerisinde tırnak kullanımı)
        System.out.println("Ali \"Java öğreniyorum\" dedi.");

        // 🎭 \b: Bir karakteri geri siler
        System.out.println("Yanlışş\b yazım.");

        // 🛠️ \r: Satır başına gider (üstüne yazar)
        System.out.println("Norveç\rOslo");

        // 🎉 ÖDEV: Konsolda 3 satırlık bir fatura tasarımı yapın!
    }
}
