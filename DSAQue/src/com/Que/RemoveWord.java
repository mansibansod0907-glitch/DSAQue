package com.Que;

import java.util.Scanner;

public class RemoveWord {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to remove: ");
        String word = sc.nextLine();

        // Remove the word (with spaces around it)
        String result = sentence.replaceAll("\\b" + word + "\\b", "").replaceAll(" +", " ").trim();

        System.out.println("Result: " + result);

        sc.close();
    }
}
