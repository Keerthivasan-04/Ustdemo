package collections;

public class DoublyLinkedList {
	class Node {
		int data;
		Node prev;
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
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.prev = temp;
	}

	public void display() {
		System.out.print("Doubly Linked List: ");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " <-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

}
