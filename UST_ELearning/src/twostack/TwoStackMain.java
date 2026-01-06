package twostack;

public class TwoStackMain {
	public static void main(String[] args) {

		TwoStacks stacks = new TwoStacks(6);

		// Push elements into Stack 1
		stacks.push1(10);
		stacks.push1(20);
		stacks.push1(30);

		// Push elements into Stack 2
		stacks.push2(100);
		stacks.push2(200);

		// Pop from Stack 1
		System.out.println("Popped from Stack1: " + stacks.pop1());

		// Pop from Stack 2
		System.out.println("Popped from Stack2: " + stacks.pop2());
	}
}
