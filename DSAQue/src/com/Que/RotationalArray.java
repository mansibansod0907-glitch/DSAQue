package com.Que;

import java.util.Scanner;

public class RotationalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int r = sc.nextInt();

        System.out.print("Rotate Left or Right (L/R): ");
        char dir = sc.next().toUpperCase().charAt(0);

        if (dir == 'L') {
            leftRotate(arr, r);
        } else if (dir == 'R') {
            rightRotate(arr, r);
        } else {
            System.out.println("Invalid direction!");
            sc.close();
            return;
        }

        System.out.println("Rotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    // Left Rotation
    public static void leftRotate(int arr[], int r) {
        int n = arr.length;
        r = r % n; // in case r > n
        for (int i = 0; i < r; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    // Right Rotation
    public static void rightRotate(int arr[], int r) {
        int n = arr.length;
        r = r % n;
        for (int i = 0; i < r; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }
}
