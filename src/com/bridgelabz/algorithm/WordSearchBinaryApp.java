package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class WordSearchBinaryApp {
	
	public static void main(String[] args) throws IOException {
		FileReader fr ;
		BufferedReader br ;
		String str, input;
		String words[] = null;
		File file = new File("/home/admin1/chetan/chetan.txt");
	
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while ((str = br.readLine()) != null) {
				words = str.toLowerCase().split(" ");

				for (String word : words) {
				
					System.out.print(" " + word);
				}
				
				System.out.println();
				
				
				System.out.println("Array After sorting ............");

				Arrays.sort(words);

				for (String word : words) {
				
					System.out.print(" " + word);
				}
				System.out.println();

				System.out.println("Enter the Word to Search");
				input = Utility.inputString();
				boolean result = Utility.binarySearch(words, input);
				if(result)
				{
					System.out.println("Word is Fount in the List");
				}
				else
				{
					System.out.println("Word is Not Fount in the List");		
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
