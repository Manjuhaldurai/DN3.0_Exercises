package Exercise3;

public class SortingCustomerOrders {

    public static void main(String[] args) {
        Order[] orders = {
                new Order("1", "Alice", 250.00),
                new Order("2", "Bob", 150.50),
                new Order("3", "Charlie", 300.75),
                new Order("4", "Dave", 100.00)
        };

        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        SortAlgorithms.bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Order[] ordersForQuickSort = {
                new Order("1", "Alice", 250.00),
                new Order("2", "Bob", 150.50),
                new Order("3", "Charlie", 300.75),
                new Order("4", "Dave", 100.00)
        };

        System.out.println("\nBefore Quick Sort:");
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }

        SortAlgorithms.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        System.out.println("\nAfter Quick Sort:");
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}

