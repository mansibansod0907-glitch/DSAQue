package com.Que;

import java.util.Scanner;

public class ReverseArray {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Create new array for reversed
	        int rev[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            rev[i] = arr[n - 1 - i];
	        }

	        System.out.println("Reversed Array:");
	        for (int num : rev) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	    }
}
