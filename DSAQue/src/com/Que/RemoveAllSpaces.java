package com.Que;

import java.util.Scanner;

public class RemoveAllSpaces {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = sentence.replaceAll("\\s+", "");

        System.out.println("Result: " + result);

        sc.close();
    }
}
