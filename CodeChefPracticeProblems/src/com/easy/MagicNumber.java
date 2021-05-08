package com.easy;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		int t = 0, // Number of test inputs
				n = 0, // Length of array,
				k = 0; // Number to be added

		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			n = sc.nextInt();
			k = sc.nextInt();
			int[] arr = new int[n];
			int count = 0, sumOfElements = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
				sumOfElements += arr[j];
			}
			for (int j = 0; j < arr.length; j++) {
				if (sumOfElements - arr[j] < arr[j] + k)
					count++;
			}
			System.out.println(count);
		}
		sc.close();
	}

}
