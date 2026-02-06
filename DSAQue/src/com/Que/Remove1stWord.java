package com.Que;

import java.util.Scanner;

public class Remove1stWord {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();

	        // Find first space and remove the first word
	        int index = sentence.indexOf(" ");
	        String result = (index != -1) ? sentence.substring(index + 1) : "";

	        System.out.println("Result: " + result);

	        sc.close();
	    }
}
