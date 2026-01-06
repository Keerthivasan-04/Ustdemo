package datastructures;

public class CircularLinkedList {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			newNode.next = head;
			return;
		}

		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = head;
	}

	public void display() {
		if (head == null) {
			System.out.println("Circular Linked List is empty");
			return;
		}

		System.out.print("Circular Linked List: ");
		Node temp = head;
		do {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		} while (temp != head);

		System.out.println("(back to head)");
	}
}
