package com.Que;

import java.util.Scanner;

public class RemoveLastWord {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();

	        int index = sentence.lastIndexOf(" ");
	        String result = (index != -1) ? sentence.substring(0, index) : "";

	        System.out.println("Result: " + result);

	        sc.close();
	    }
}
