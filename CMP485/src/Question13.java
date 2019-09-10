package CMP485;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a snippet that will read from input continuously until 
		//the user types ‘q’.
		//(refer to the attached Scanner API if you need to)
		
		
		Scanner scnr = new Scanner(System.in); 
		String letters = scnr.nextLine();
		
		while( letters != "q")
			System.out.println(letters);
		
		


	}

}
