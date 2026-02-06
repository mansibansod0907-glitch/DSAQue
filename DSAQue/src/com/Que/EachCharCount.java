package com.Que;

import java.util.Scanner;

public class EachCharCount {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        System.out.println("Character Count:");

        for (int i = 0; i < ch.length; i++) {
            int count = 1;

            // Skip already counted characters
            if (ch[i] == '0')
                continue;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0'; // mark as counted
                }
            }

            System.out.println(ch[i] + " : " + count);
        }

        sc.close();
    }
}
