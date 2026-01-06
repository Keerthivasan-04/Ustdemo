package binarysearch;

public class BinarySearchMain {
	public static void main(String[] args) {

		// Sorted array (mandatory for binary search)
		int[] arr = { 3, 7, 12, 18, 25, 31, 42 };
		int key = 18;

		int result = BinarySearchRecursive.binarySearch(arr, 0, arr.length - 1, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found");
		}
	}
}
