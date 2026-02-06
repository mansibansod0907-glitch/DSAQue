package com.Que;

import java.util.Scanner;

public class FreqInString {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        str = str.replaceAll("\\s+", ""); // remove spaces if needed
	        char[] chars = str.toCharArray();
	        boolean[] counted = new boolean[chars.length];

	        System.out.println("Character frequencies:");

	        for (int i = 0; i < chars.length; i++) {
	            if (counted[i])
	                continue;

	            int count = 1;
	            for (int j = i + 1; j < chars.length; j++) {
	                if (chars[i] == chars[j]) {
	                    count++;
	                    counted[j] = true;
	                }
	            }

	            System.out.println(chars[i] + " : " + count);
	        }

	        sc.close();
	    }
}
