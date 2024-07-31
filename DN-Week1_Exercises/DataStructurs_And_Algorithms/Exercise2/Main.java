package Exercise2;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Smartphone", "Electronics"),
                new Product("3", "Table", "Furniture"),
                new Product("4", "Chair", "Furniture")
        };

        String targetId = "3";
        int index = SearchAlgorithms.linearSearch(products, targetId);
        System.out.println("Linear Search:");
        if (index != -1) {
            System.out.println("Product found at index " + index + ": " + products[index]);
        } else {
            System.out.println("Product not found.");
        }

        Product[] sortedProducts = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Smartphone", "Electronics"),
                new Product("3", "Table", "Furniture"),
                new Product("4", "Chair", "Furniture")
        };
        index = SearchAlgorithms.binarySearch(sortedProducts, targetId);
        System.out.println("\nBinary Search:");
        if (index != -1) {
            System.out.println("Product found at index " + index + ": " + sortedProducts[index]);
        } else {
            System.out.println("Product not found.");
        }
    }
}
