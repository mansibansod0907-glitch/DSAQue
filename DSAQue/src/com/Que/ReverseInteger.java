package com.Que;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  // get last digit
            reversed = reversed * 10 + digit;  // append digit
            num = num / 10;  // remove last digit
        }

        System.out.println("Original Number: " + originalNum);
        System.out.println("Reversed Number: " + reversed);

        sc.close();
    }
}
