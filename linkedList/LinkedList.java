import java.util.NoSuchElementException;

public class LinkedList<T> implements LinkedListInterface<T> {

	// member variables
	private Node<T> head; // head node
	private int size;
	
	// O(1)
	public void newHead(T newHead) {
		// replace current head node with a new head node
		head = new Node<T>(newHead, head);
		size++;
	}
	
	// O(1)
	public void deleteHead() {
		// delete current head node
		if(head == null) {
			throw new NoSuchElementException("Cant delete head node, Linked List is empty");
		}
		head = head.getNext();
		size--;
	}
	
	// O(n)
	public void newTail(T tail) {
		// replace current tail node
		// create a new Node using object that was passed in
		Node<T> newTailNode = new Node<T>(tail);
		if(head == null) {
			head = newTailNode;
		}
		else {
			Node<T> temp = head;
			// loop til reachd  end of linked list
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newTailNode);			
		}
		size++;
	}
	
	// O(n)
	public void deleteTail() {
		// delete current tail node
		if(head == null) {
			throw new NoSuchElementException("Cant delete tail node, Linked List is empty");
		}
		Node<T> temp = head;
		while(temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		size--;
	}
	
	// O(n)
	public boolean contains(T item) {
		// search for an item in the linked list, return true if found, false otherwise
	
		// 1. make sure we have head node
		if(head == null) {
			System.out.println("Cant search, Linked List is empty");
			return false;
		}
		
		// 2. make sure the item we are searching for is not the head node itself
		if(head.getItem().equals(item)) {
			return true;
		}
				
		// 3. loop until we reach null and look for item
		Node<T> temp = head;
		while(temp.getNext() != null) {
			if(temp.getItem().equals(item)) {
				return true;
			}
			temp = temp.getNext();
		}
		
		return false;
	}
	
	// O(n)
	public void deleteItem(T item) {
		// if found, delete the item 
		if(head == null) {
			throw new IllegalStateException("Cant delete item; Empty");
		}
		if(head.getItem().equals(item)) {
			head = head.getNext();
			size--;
			return;
		}
		Node<T> temp = head;
		Node<T> tempNext = temp.getNext(); // NEXT!!!
		while(tempNext != null) {
			if(tempNext.getItem().equals(item)) {
				temp.setNext(tempNext.getNext());
				size--;
				return;
			}
			temp = tempNext;
			tempNext = temp.getNext();
		}
	}
	
	// O(1)
	public void clear() {
		// destroy the linked list
		head = null;
		size = 0;
	}
	
	// O(1)
	public int size() {
		// return size of the linked list
		return size;
	}
	
	// O(1)
	public boolean isEmpty() {
		// return true if linked list if empty, false otherwise
		if(head == null) {
			return true;
		} else{
			return false;
		}
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Unable to print, Linked List is empty");
			return;
		}
		Node<T> temp = head;
		while(temp != null) {
			System.out.println(temp.getItem().toString());
			temp = temp.getNext();
		}	
	}

}