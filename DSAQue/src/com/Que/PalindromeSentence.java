package com.Que;

import java.util.Scanner;

public class PalindromeSentence {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Convert to lowercase and remove non-letter characters
        String clean = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check palindrome
        boolean isPalindrome = true;
        int len = clean.length();
        for (int i = 0; i < len / 2; i++) {
            if (clean.charAt(i) != clean.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("The sentence is a palindrome.");
        else
            System.out.println("The sentence is NOT a palindrome.");

        sc.close();
    }
}
