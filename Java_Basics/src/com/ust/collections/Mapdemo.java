package com.ust.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("USD", "United States of America");
		map1.put("INR", "India");
		map1.put("Euro","Austria");
		
		
		System.out.println("-------Hashmap Output------");
		for (Map.Entry<String, String> entry : map1.entrySet()) {
		    System.out.println("Key: "+ entry.getKey() + " -> " + "Value: "+ entry.getValue());
		}
		System.out.println();
		
		Map<String, String> map2 = new LinkedHashMap<>();
		map2.put("USD", "United States of America");
		map2.put("INR", "India");
		map2.put("Euro","Austria");
		
		System.out.println("-------LinkedHashmap Output------");
		for (Map.Entry<String, String> entry : map2.entrySet()) {
		    System.out.println("Key: "+ entry.getKey() + " -> " + "Value: "+ entry.getValue());
		}
		System.out.println();
		
		Map<String, String> map3 = new TreeMap<>();
		map3.put("USD", "United States of America");
		map3.put("INR", "India");
		map3.put("Euro","Austria");
		
		System.out.println("-------Treemap Output------");
		for (Map.Entry<String, String> entry : map3.entrySet()) {
		    System.out.println("Key: "+ entry.getKey() + " -> " + "Value: "+ entry.getValue());
		}
		System.out.println();
		
		
		System.out.println("-------Only Key-------");
		for(String s : map1.keySet()) {
			System.out.println("Key: " + " -> " + s);
		}
		System.out.println();
		
		System.out.println("-------Only Value-------");
		for(String s1 : map1.values()) {
			System.out.println("Value: " + " -> " + s1);
		}
		System.out.println();

	}

}
