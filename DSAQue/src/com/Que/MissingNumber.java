package com.Que;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array (n-1 elements): ");
        int n = sc.nextInt(); // n-1 elements

        int arr[] = new int[n];

        System.out.println("Enter elements (1 to " + (n+1) + " with one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Formula method
        int total = (n + 1) * (n + 2) / 2; // sum of 1 to n+1
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int missing = total - sum;
        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}
