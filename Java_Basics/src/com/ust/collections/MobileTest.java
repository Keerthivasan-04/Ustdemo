package com.ust.collections;

import java.util.ArrayList;

public class MobileTest {
	
	public static void main(String[] args) {
        Mobile m1 = new Mobile("Galaxy S23", "Samsung", 74999);
        Mobile m2 = new Mobile("iPhone 14", "Apple", 79999);
        Mobile m3 = new Mobile("Pixel 8", "Google", 70999);

        ArrayList<Mobile> mobileList = new ArrayList<>();

        mobileList.add(m1);
        mobileList.add(m2);
        mobileList.add(m3);

        for (Mobile mobile : mobileList) {
            System.out.println(mobile);
        }
    }
}
