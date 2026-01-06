package com.example.child;
import com.example.base.Person;

public class SubClassTest extends Person{

	 public SubClassTest() {
	        super(2, "Bob", "bob@mail.com", "USA");
	    }

	    public void testAccess() {
	        // System.out.println(id);        // private
	        // System.out.println(name);      // default (different package)
	        System.out.println(email);       //  protected (via inheritance)
	        System.out.println(country);     //  public
	    }

	    public static void main(String[] args) {
	        SubClassTest s = new SubClassTest();
	        s.testAccess();
	    }

}
