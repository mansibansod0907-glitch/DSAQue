package com.Que;

import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String result = sentence.replace(String.valueOf(ch), "");

        System.out.println("Result: " + result);

        sc.close();
    }

}
