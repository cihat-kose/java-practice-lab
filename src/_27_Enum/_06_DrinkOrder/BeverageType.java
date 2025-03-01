package _27_Enum._06_DrinkOrder;

/**
 * BeverageType enum'u, çeşitli içecek türlerini ve bu içeceklerin özelliklerini temsil eder.
 */
public enum BeverageType {
    COLA("Cola", 1.5),
    SU("Su", 0.5),
    LEMONADE("Limonata", 1.2),
    ICE_TEA("Ice Tea", 1.3),
    FRUIT_JUICE("Meyve Suyu", 1.8);

    private final String name;
    private final double price;

    /**
     * Constructor: Her içecek türü için ad ve fiyat değerlerini ayarlar.
     *
     * @param name  İçecek adı
     * @param price İçecek fiyatı
     */
    BeverageType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * İçecek adını döndüren metot.
     *
     * @return İçeceğin adı
     */
    public String getName() {
        return name;
    }

    /**
     * İçecek fiyatını döndüren metot.
     *
     * @return İçeceğin fiyatı
     */
    public double getPrice() {
        return price;
    }
}



/*
Özet:
- Enum sabitleri (COLA, SU, vb.), belirli bir sabit grup değeri temsil eder.
- Bu sabitlerin her birine ad ve fiyat gibi ek bilgiler atanabilir.
- getAd() ve getPrice() metotları, enum sabitlerinin özelliklerini döndürmek için kullanılır.
- Enum'lar, yanlış veri girişini engeller ve kodun daha güvenli olmasını sağlar.
*/
