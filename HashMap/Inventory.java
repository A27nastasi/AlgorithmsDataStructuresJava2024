package HashMap;


import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    
    public void addProduct(Product product) {
        products.put(product.getProductCode(), product);
    }

    
    public void removeProduct(String productCode) {
        products.remove(productCode);
    }

    
    public Product getProduct(String productCode) {
        return products.get(productCode);
    }

   
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Инвентарь пуст.");
        } else {
            for (Map.Entry<String, Product> entry : products.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }
}
