package com.ust.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		
		// HashSet — random order, no duplicates
		Set<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Dog");   // duplicate ignored
        set1.add("Ant");

        // LinkedHashSet — insertion order preserved
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Red");
        set2.add("Blue");
        set2.add("Green");
        set2.add("Red");   // duplicate ignored
        set2.add("Yellow");

        // TreeSet — sorted (alphabetical) order
        Set<String> set3 = new TreeSet<>();
        set3.add("Zebra");
        set3.add("Lion");
        set3.add("Tiger");
        set3.add("Lion");  // duplicate ignored
        set3.add("Ant");

		System.out.println("----- HashSet Output -----");
		Iterator<String> it1 = set1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("\n----- LinkedHashSet Output -----");
		Iterator<String> it2 = set2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		System.out.println("\n----- TreeSet Output -----");
		Iterator<String> it3 = set3.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
	}
}
