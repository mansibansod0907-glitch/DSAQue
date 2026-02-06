package com.Que;

public class MethodOverloading {
	  // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        System.out.println("Add 2 integers: " + obj.add(5, 10));
        System.out.println("Add 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + obj.add(5.5, 10.5));
    }
}
