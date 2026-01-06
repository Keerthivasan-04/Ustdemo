package twostack;

public class TwoStacks {
	private int[] arr;
	private int size;
	private int top1;
	private int top2;

	public TwoStacks(int size) {
		this.size = size;
		arr = new int[size];
		top1 = -1; // Stack 1 starts from left
		top2 = size; // Stack 2 starts from right
	}

	// Push element to first stack
	public void push1(int x) {
		if (top1 + 1 == top2) {
			throw new RuntimeException("Stack Overflow - No space for Stack1");
		}
		arr[++top1] = x;
	}

	// Push element to second stack
	public void push2(int x) {
		if (top1 + 1 == top2) {
			throw new RuntimeException("Stack Overflow - No space for Stack2");
		}
		arr[--top2] = x;
	}

	// Pop element from first stack
	public int pop1() {
		if (top1 < 0) {
			throw new RuntimeException("Stack1 Underflow");
		}
		return arr[top1--];
	}

	// Pop element from second stack
	public int pop2() {
		if (top2 >= size) {
			throw new RuntimeException("Stack2 Underflow");
		}
		return arr[top2++];
	}
}
