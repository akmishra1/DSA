package com.akash.array;


public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 4, 6, 9, 3, 7, 5, 2, 5 };
		int result = getDuplicate(arr);
		System.out.println(result);

	}

	private static int getDuplicate(int[] arr) {

		int result = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int k = i + 1; k < arr.length; k++) {
				System.out.println("checking  :" + arr[i] + "  with:: " + arr[k]);
				if (arr[i] == arr[k]) {
					result = arr[i];
					return result;
				}

			}

		}
		return result;

	}