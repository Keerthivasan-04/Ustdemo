package com.ust.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> in = new LinkedList();
		in.offer("Entry1");
		in.offer("Entry2");
		in.offer("Entry3");
		
		in.remove();
		System.out.println(in.poll());
		System.out.println(in);
		

	}

}
