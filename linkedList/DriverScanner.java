import java.util.Scanner;

public class DriverScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Book> bookList = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        LinkedList<Book> books = new LinkedList<>();

        System.out.print("Enter number of books: ");
        String numberOfBooksStr = sc.nextLine();
        int numberOfBooks = Integer.parseInt(numberOfBooksStr);

        print("numberOfBooksStr: " + numberOfBooksStr);
        print("numberOfBooks: " + numberOfBooks);
        Book[] bookS = new Book[numberOfBooks];

        // Printing the initial empty list
        print("\nLinked List: ");
        books.print();

        // Adding books to the list
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.print("Enter name of book: ");
            String name = sc.nextLine();
            System.out.print("Enter ISBN of book: ");
            int ISBN = Integer.parseInt(sc.nextLine());
            bookS[i] = new Book(name, ISBN); // Creates a new Book instance
            books.newHead(bookS[i]); // Adds the Book instance to the head of the list
        }       

        int choice;
        do {
            print("\nLinked List Menu:");
            print("1. Add book at head");
            print("2. Add book at tail");
            print("3. Delete book from head");
            print("4. Delete book from tail");
            print("5. Search for a book");
            print("6. Delete a book");
            print("7. Clear the list");
            print("8. Print the list");
            print("9. Exit");
            print("");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            print("");

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    //int ISBN = Integer.parseInt(sc.nextLine());
                    int ISBN = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    Book book = new Book(name, ISBN);
                    books.newHead(book);
                    print("");
                    break;
                case 2:
                    System.out.print("Enter book name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    ISBN = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    book = new Book(name, ISBN);
                    books.newTail(book);
                    print("");
                    break;
                case 3:
                    books.deleteHead();
                    print("Deleted head...");
                    print("");
                    break;
                case 4:
                    books.deleteTail();
                    print("Deleted Tail...");
                    print("");
                    break;
                case 5:
                    System.out.print("Enter book ISBN to search: ");
                    ISBN = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    book = new Book("", ISBN);
                    System.out.println(books.contains(book));
                    print("");
                    break;
                case 6:
                    System.out.print("Enter book ISBN to delete: ");
                    ISBN = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    book = new Book("", ISBN);
                    books.deleteItem(book);
                    print("");
                    break;
                case 7:
                    books.clear();
                    print("Books cleared...");
                    print("");
                    break;
                case 8:
                print("Linked List:");
                    books.print();
                    print("");
                    break;
                case 9:
                    print("Exiting App...");
                    print("");
                    break;
                default:
                    print("Invalid choice. Try again.");
            }
        } while (choice != 9);

        scanner.close();
        sc.close();
    }

    public static void print(String s) {
        System.out.println(s);
    }
}