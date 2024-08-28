import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class base {
    public static void main(String[] args) {
        HotDrink d1 = new HotDrink("Coffee", 1.5, 70, 100);
        HotDrink d2 = new HotDrink("Tea", 0.3, 80, 120);
        HotDrink d3 = new HotDrink("Hot Chocolate", 1.3, 90, 150);
        waterBottle w1 = new waterBottle("Water", 0.5);
        bread b1 = new bread();

        List<product> p = new ArrayList<>(Arrays.asList(d1, d2, w1));
        List<product> p2 = new ArrayList<>(Arrays.asList(d1, d3, b1));
        HotDrinkVM HotDrinkVendingMachine = new HotDrinkVM();
        HotDrinkVM HDVM2 = new HotDrinkVM();

        HotDrinkVendingMachine.initDrinks(p);
        HDVM2.initDrinks(p2);

        System.out.println(HotDrinkVendingMachine.getHotDrink("Coffee", 100, 70));
        System.out.println(HDVM2.getHotDrink("Hot Chocolate", 150, 90));
    }
}