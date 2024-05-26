package store;

import java.util.List;

public final class StoreUtil {
    
    // Private constructor to prevent instantiation
    private StoreUtil() {
        // private constructor
    }

    // Static method to calculate total sales
    public static double calculateTotalSales(List<Product> products) {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}