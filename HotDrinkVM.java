import java.util.ArrayList;
import java.util.List;

public class HotDrinkVM implements vendingMachine {
    private List<HotDrink> drinks = new ArrayList<>();
    
    /**
     * Initializes list of products.
     * @param products List of products.
     */
    public void initDrinks(List<product> products) {
        for (product product : products) {
            if (product instanceof HotDrink) drinks.add((HotDrink) product);
        }
    }
    @Override
    public HotDrink getHotDrink(String name, int volume, int temperature) {
        HotDrink drink;
        for (product obj : drinks) {
            if (obj instanceof HotDrink) {
                drink = (HotDrink) obj;
                if (drink.getName().equals(name) && drink.getVolume().equals(volume) && drink.getTemperature().equals(temperature)) return drink; 
            }
        }
        return null;
    }
    
}