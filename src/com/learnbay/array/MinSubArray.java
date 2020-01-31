package com.akash.array;

public class MinSubArray
{


	private static int[] getMinSum(int[] arr, int size) {

		int minSum = Integer.MAX_VALUE;
		int[] result = new int[3];
		for (int i = 0; i < arr.length; i++) {
			int tempSum = 0;
			if (size + i < arr.length) {

				for (int k = 0; k < size; k++) {
					tempSum += arr[i + k];

				}

				if (minSum > tempSum) {
					minSum = tempSum;
					result[0] = i;
					result[1] = i + size - 1;
					result[2] = minSum;
				}

			}

		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 4, 3, 5, 6, 3, 8, 1 };
		int[] result = getMinSum(arr, 3);
		System.out.println("Index " + result[0] + " to " + result[1] + " with sum as " + result[2]);
	}

}