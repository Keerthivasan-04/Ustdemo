package com.ust.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {

		try {
			FileInputStream fs = new FileInputStream("d:/abc.txt");

			String str = "Str";
			str.toLowerCase();

			String strNum = "3z";

			int i = Integer.parseInt(strNum);
			System.out.println(i);

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
ex.printStackTrace();
		} catch (NumberFormatException ex) {
			System.out.println("--" + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("***" + ex.getMessage());
		}
	}
}
