public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 10, 2);

        Library library = new Library(book1, "Perpustakaan Kota");

        System.out.println("--- Initial Information ---");
        library.showLibraryInfo();

        book1.adjustStock(8);

        System.out.println("\n--- Upated Information ---");
        library.showLibraryInfo();
    }
}