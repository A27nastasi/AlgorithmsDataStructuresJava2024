package HashMap;

public class Answer {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

       
        Product product1 = new Product("001", "Молоко", 50);
        Product product2 = new Product("002", "Хлеб", 30);
        Product product3 = new Product("003", "Яблоки", 100);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        
        System.out.println("Все товары:");
        inventory.displayAllProducts();

        
        System.out.println("\nПоиск товара с кодом '002':");
        Product foundProduct = inventory.getProduct("002");
        if (foundProduct != null) {
            System.out.println(foundProduct);
        } else {
            System.out.println("Товар не найден.");
        }

        
        System.out.println("\nУдаление товара с кодом '003'.");
        inventory.removeProduct("003");

       
        System.out.println("\nВсе товары после удаления:");
        inventory.displayAllProducts();
    }
}
