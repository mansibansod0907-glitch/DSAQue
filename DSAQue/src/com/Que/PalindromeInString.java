package com.Que;

import java.util.Scanner;

public class PalindromeInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase to ignore case
        String cleanStr = str.toLowerCase();

        boolean isPalindrome = true;
        int len = cleanStr.length();

        for (int i = 0; i < len / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is NOT a palindrome.");

        sc.close();
    }
}
