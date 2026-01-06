package com.ust.files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Ex1: Create a file in one of the directories in your computer and write a text on it.
 */


public class FileWrite {

	public static void main(String[] args){
		
		String content = "Hello! This file is created using Java NIO.";

        
        Path file = Paths.get("D://sample.txt");

        try {
            
            Files.writeString(
                file,
                content,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );

            System.out.println("File created and text written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		
		
		
		try (FileWriter writer = new FileWriter("sample.txt")) {	
            writer.write("Hello from FileWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
