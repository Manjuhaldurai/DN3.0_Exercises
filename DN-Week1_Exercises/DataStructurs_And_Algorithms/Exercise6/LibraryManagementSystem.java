package Exercise6;



import java.util.Arrays;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book[] books = {
                new Book("1", "To Kill a Mockingbird", "Harper Lee"),
                new Book("2", "1984", "George Orwell"),
                new Book("3", "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("4", "Moby Dick", "Herman Melville")
        };

        System.out.println("All Books:");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\nSearching for '1984' using Linear Search:");
        int index = SearchAlgorithms.linearSearch(books, "1984");
        if (index != -1) {
            System.out.println("Book found: " + books[index]);
        } else {
            System.out.println("Book not found.");
        }

        // Sorting books array by title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        System.out.println("\nSearching for '1984' using Binary Search:");
        index = SearchAlgorithms.binarySearch(books, "1984");
        if (index != -1) {
            System.out.println("Book found: " + books[index]);
        } else {
            System.out.println("Book not found.");
        }
    }
}
