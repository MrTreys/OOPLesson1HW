public class bread extends product {
    private String typeOfFlour;

    /**
     *  Bread full constructor.
     * @param productName Name;
     * @param productPrice Price (amount);
     * @param productTypeOfFlour Flour type.
     */
    public bread(String productName, Double productPrice, String productTypeOfFlour) {
        name = productName;
        price = productPrice;
        typeOfFlour = productTypeOfFlour;
    }

    /**
     *  Bread halved constructor.
     * @param productName Name;
     * @param productPrice Price (amount).
     */
    public bread(String productName, Double productPrice) {
        this(productName, productPrice, "Wheat");
    }

    /**
     * Bread blank constructor.
     */
    public bread() {
        this(String.format("Product_%d", defaultName++), 1.0);
    }

    /**
     * @return Bread's flour type.
     */
    public String getTypeOfFlour() {
        return typeOfFlour;
    }
}