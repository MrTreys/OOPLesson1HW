public class waterBottle extends product {
    private Double volume;

    /**
     * Full water bottle constructor.
     * @param productName Water;
     * @param productPrice Water bottle's price;
     * @param productVolume Water bottle's volume (liters).
     */
    public waterBottle(String productName, Double productPrice, Double productVolume) {
        name = productName;
        price = productPrice;
        volume = productVolume;
    }

    /**
     * Halved water bottle constructor.
     * @param productName Water;
     * @param productPrice Water bottle's price.
     */
    public waterBottle(String productName, Double productPrice) {
        this(productName, productPrice, 1.0);
    }

    /**
     * Blank water bottle constuctor.
     */
    public waterBottle() {
        this(String.format("Product_%d", defaultName++), 1.0);
    }

    /**
     * @return Water bottle's volume (liters).
     */
    public Double getVolume() {
        return volume;
    }
}
