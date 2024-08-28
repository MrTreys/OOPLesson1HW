public class HotDrink extends product {
    private Integer temperature;
    private Integer volume;

    /**
     * Full hot drink constructor.
     * @param productName Drink's name;
     * @param productPrice Drink's price (dollars);
     * @param productTemperature Drink's temperature (Celsius);
     * @param productVolume Drink (milliliters)
     */
    public HotDrink(String productName, Double productPrice, Integer productTemperature, Integer productVolume) {
        name = productName;
        price = productPrice;
        temperature = productTemperature;
        volume = productVolume;
    }

    /**
     * Halved hot drink constructor.
     * @param productName Drink's name;
     * @param productPrice Drink's price (dollars);
     */
    public HotDrink(String productName, Double productPrice) {
        this(productName, productPrice, 50, 100);
    }

    /**
     * Blank hot drink constructor.
     */
    public HotDrink() {
        this(String.format("Product_%d", defaultName++), 1.0);
    }

    /**
     * @return Drink's temperature (Celsius).
     */
    public Integer getTemperature() {
        return temperature;
    }

    /**
     * @return Drink's volume (milliliters).
     */
    public Integer getVolume() {
        return volume;
    }
}