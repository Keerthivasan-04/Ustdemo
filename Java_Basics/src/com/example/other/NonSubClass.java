package com.example.other;

import com.example.base.Person;
public class NonSubClass {
	public static void main(String[] args) {
        Person p = new Person(3, "Charlie", "charlie@mail.com", "UK");

        // System.out.println(p.id);      // private
        // System.out.println(p.name);    // default
        // System.out.println(p.email);   // protected (no inheritance)
        System.out.println(p.country);   //  public
    }

}
