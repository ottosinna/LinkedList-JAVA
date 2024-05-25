import java.util.Iterator;

// step 1
import java.util.Scanner; // used to read input from user via keyboard

class DriverS {

	public static void main(String[] args) {
	
		// step 2
		Scanner sc = new Scanner(System.in);
		LinkedList<Book> books = new LinkedList<Book>();
		
		System.out.print("Enter number of books: " );
		String numberOfBooksStr = sc.nextLine();
		int numberOfBooks = Integer.parseInt(numberOfBooksStr);
		
		print("numberOfBooksStr: " + numberOfBooksStr);
		print("numberOfBooks: " + numberOfBooks);
		Book[] bookS = new Book[numberOfBooks];

		// Book book1= new Book("dogs", 61111);
		
		//printing list
		print("\nLinked List: ");
		books.print();

		//books intialize
		for(int i = 0; i < numberOfBooks; i++) {
			System.out.print("Enter name of books: ");
			String name = sc.nextLine();
			System.out.print("Enter ISBN of books: ");
			int ISBN = Integer.parseInt(sc.nextLine());
			bookS[i] = new Book(name, ISBN); // creates a new object/instance of Book
			books.newHead(bookS[i]); // add new object/instance to Books array
		}
				
			System.out.print("Enter name of books: ");
			String name = sc.nextLine();
			System.out.print("Enter ISBN of books: ");
			int ISBN = Integer.parseInt(sc.nextLine());
			Book book6 = new Book(name, ISBN); 
			books.newTail(book6); 

		for(int i = 0; i < numberOfBooks; i++) {
			boolean answer = books.contains(bookS[i]);	
			print("Is " + bookS[i].getName() + " in my book: " + answer);
		}
		
		Book anotherBook = new Book("Breaking Bad", 70);		
		boolean contains = books.contains(anotherBook);		
		print("Is " + anotherBook.getName() + " in my book: " + contains);	

		print("Empty? - " + books.isEmpty());
		print("Size? - " + books.size());
		print("");
		//
		print("deleting first book");
		books.deleteItem(bookS[0]);
		//
		print("deleting next tail...");
		books.deleteTail();
		print("deleting next head...");
		books.deleteHead();
		print("");
		print("New linked list:");
		books.print();

		for(int i = 0; i < numberOfBooks; i++) {
			boolean answer = books.contains(bookS[i]);	
			print("Is " + bookS[i].getName() + " in my book: " + answer);
		}

		books.clear();
		print("Clearing Linked List...");
		print("size - " + books.size());
		print("Empty? - " + books.isEmpty());

		print("");
		print("New Linked List");
		books.print();
	}
	public static void print(String s){
		System.out.println(s);
	}
}
// Previous session code
		/*		
		Book game1 = new Book("A", 70.00);
		Book game2 = new Book("B", 80.00);
		Book game3 = new Book("C", 90.00);		
		
		int compareValue = game1.compareTo(game2);
		print("compareValue: " + compareValue);
		
		book.add(game1);
		book.add(game2);
		book.add(game3);
		
		boolean game1Contains = book.contains(game1);		
		print("Is " + game1.getName() + " in my book: " + game1Contains);
		
		boolean game2Contains = book.contains(game2);		
		print("Is " + game2.getName() + " in my book: " + game2Contains);
		
		boolean game3Contains = book.contains(game3);		
		print("Is " + game3.getName() + " in my book: " + game3Contains);
		*/