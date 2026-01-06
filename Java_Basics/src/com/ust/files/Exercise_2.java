package com.ust.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise_2 {

	public static void main(String[] args) {
		Path file = Paths.get("d://sample.txt");
		
		List<String> lines;
		try {
			
			lines = Files.readAllLines(file);
			for(String line : lines) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
