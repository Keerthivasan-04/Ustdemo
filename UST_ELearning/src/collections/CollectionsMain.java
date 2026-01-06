package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionsMain {
	public static void main(String[] args) {

        // ===== STACK =====
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack pop: " + stack.pop());

        System.out.println();

        // ===== QUEUE =====
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue poll: " + queue.poll());

        System.out.println();

        // ===== LINKED LIST =====
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("DSA");
        linkedList.add("Collections");
        System.out.println("LinkedList: " + linkedList);

        System.out.println();

        // ===== ARRAY LIST =====
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        System.out.println("ArrayList: " + arrayList);

        System.out.println();

        // ===== HASH SET =====
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate ignored
        System.out.println("HashSet: " + hashSet);

        System.out.println();

        // ===== DOUBLY LINKED LIST =====
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(5);
        dll.insert(10);
        dll.insert(15);
        dll.display();
    }

}
