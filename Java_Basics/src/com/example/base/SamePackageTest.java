package com.example.base;

public class SamePackageTest {
	public static void main(String[] args) {
		Person p = new Person(1, "Alex", "alex@mail.com", "India");

        //System.out.println(p.id);     //private
        System.out.println(p.name);    //default
        System.out.println(p.email);    //protected
        System.out.println(p.country);  //public

        // Access private via getter
        System.out.println(p.getId());  
	}
}
