class Driver {

	public static void main(String[] args) {
	
		LinkedList<Book> books = new LinkedList<Book>();
		
		print("Linked List: ");
		Book book1 = new Book("Cime and Punishment", 6543210);
		Book book2 = new Book("Hunger Games", 6543211);
		Book book3 = new Book("Dogs", 6543212);
		Book book4 = new Book("Curious George", 6543213);
		Book book5 = new Book("Rick & Morty", 6543214);
		Book book6 = new Book("Discpicable me", 6543215);
		
		books.newHead(book1);
		books.newHead(book2);
		books.newHead(book3);
		books.newHead(book4);
		books.newHead(book5);
		books.newTail(book6);
		
		books.print();
		print("Empty? - " + books.isEmpty());
		print("Size? - " + books.size());
		print("deleting Dog...");
		books.deleteItem(book3);
		print("deleting tail...");
		books.deleteTail();
		print("deleting head...");
		books.deleteHead();
		
		print("");
		print("New linked list:");
		books.print();
		print("does curious Goerge contain? - " + books.contains(book4));
		print("does curious Dispicable Me? - " + books.contains(book6));
		books.clear();
		print("Clearing Linked List...");
		print("size - " + books.size());
		print("Empty? - " + books.isEmpty());
		print("trying to delete Curious George...");
		books.deleteItem(book4);
		print("Is Curious George here? - " + books.contains(book4));

		print("");
		print("New Linked List");
		books.print();


		



	}

	public static void print(String s){
		System.out.println(s);
	}
}