public abstract class product {
    protected String name;
    protected Double price;
    protected static int defaultName = 0;

    /**
     * Base product constructor.
     * @param productName
     * @param productPrice
     */
    public product(String productName, Double productPrice) {
        name = productName;
        price = productPrice;
    }

    /**
     * Blank product constuctor.
     */
    public product() {
        this(String.format("Product_%d", defaultName++), 1.0);
    }

    /**
     * @return Product's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return Product's price.
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * Sets product's price.
     * @param newPrice New price.
     */
    public void setPrice(Double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return String.format("%s will cost %f$\n", getName(), getPrice());
    }
}
