package Exercise1;

import java.util.HashMap;

public class InventoryManagementSystem {
    private HashMap<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    // Add a new product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update an existing product
    public void updateProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Delete a product
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Get a product by ID
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    // Get all products
    public HashMap<String, Product> getAllProducts() {
        return inventory;
    }

    // Print the inventory
    public void printInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    // Additional methods
    public Product searchProductByName(String productName) {
        for (Product product : inventory.values()) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null; // Product not found
    }

    public void updateProductQuantity(String productId, int newQuantity) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
        }
    }

    public double calculateTotalInventoryValue() {
        double totalValue = 0;
        for (Product product : inventory.values()) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }

    public void checkLowStock(int threshold) {
        for (Product product : inventory.values()) {
            if (product.getQuantity() < threshold) {
                System.out.println("Low stock alert: " + product);
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Sample products
        Product p1 = new Product("1", "Product1", 10, 100.0);
        Product p2 = new Product("2", "Product2", 5, 50.0);

        // Add products
        ims.addProduct(p1);
        ims.addProduct(p2);

        // Print inventory
        ims.printInventory();

        // Update product quantity
        ims.updateProductQuantity("1", 15);

        // Print inventory
        ims.printInventory();

        // Check low stock
        ims.checkLowStock(10);

        // Calculate total inventory value
        System.out.println("Total Inventory Value: " + ims.calculateTotalInventoryValue());
    }
}
