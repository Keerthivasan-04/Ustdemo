package datastructures;

public class Main {
	public static void main(String[] args) {

		// ===== ARRAY =====
		ArrayDemo arrayDemo = new ArrayDemo(5);
		arrayDemo.insert(0, 10);
		arrayDemo.insert(1, 20);
		arrayDemo.insert(2, 30);
		arrayDemo.insert(3, 40);
		arrayDemo.insert(4, 50);
		arrayDemo.display();

		System.out.println();

		// ===== SINGLY LINKED LIST =====
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insert(1);
		sll.insert(2);
		sll.insert(3);
		sll.display();

		System.out.println();

		// ===== DOUBLY LINKED LIST =====
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.display();

		System.out.println();

		// ===== CIRCULAR LINKED LIST =====
		CircularLinkedList cll = new CircularLinkedList();
		cll.insert(100);
		cll.insert(200);
		cll.insert(300);
		cll.display();
	}
}
