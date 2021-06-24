package com.easy;

import java.util.Scanner;

public class SquaredSubsequences {

	public static void main(String[] args) {
		int t = 0, // Number of test inputs
				n = 0; // Length of array

		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			n = sc.nextInt();
			int[] arr = new int[n];
			int count = 0, product = 1;

			for (int j = 0; j < arr.length; j++) {
				arr[j] = Math.abs(sc.nextInt());
			}
			for (int a : arr) {
				product *= a;
				if ((product % 4 != 2) || (a % 4 != 2)) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();

	}

}
