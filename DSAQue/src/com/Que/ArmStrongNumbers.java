package com.Que;

import java.util.Scanner;

public class ArmStrongNumbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits = 0;

        // Count number of digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check result
        if (sum == originalNum)
            System.out.println(originalNum + " is an Armstrong Number");
        else
            System.out.println(originalNum + " is NOT an Armstrong Number");

        sc.close();
    }
}
