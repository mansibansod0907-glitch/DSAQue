package com.Que;

import java.util.Scanner;

public class ArrrayApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Copy arrays for each sort
        int bubbleArr[] = arr.clone();
        int insertionArr[] = arr.clone();
        int selectionArr[] = arr.clone();

        BubbleSort.bubbleSort(bubbleArr);
        InsertionSort.insertionSort(insertionArr);
        SelectionSort.selectionSort(selectionArr);

        System.out.println("\nBubble Sort:");
        PrintArray.printArray(bubbleArr);

        System.out.println("Insertion Sort:");
        PrintArray.printArray(insertionArr);

        System.out.println("Selection Sort:");
        PrintArray.printArray(selectionArr);

        sc.close();
    }
}

