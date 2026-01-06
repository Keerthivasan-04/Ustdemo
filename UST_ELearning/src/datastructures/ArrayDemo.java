package datastructures;

public class ArrayDemo {
	private int[] arr;

	public ArrayDemo(int size) {
		arr = new int[size];
	}

	public void insert(int index, int value) {
		arr[index] = value;
	}

	public void display() {
		System.out.println("Array Elements:");
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
