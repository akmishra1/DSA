package com.akash.array;

public class MaxProd
{
//	Input : -10, -3, 5, 6, -2
//	output : -10 and -3
	
	private static int[] getMaxProd(int[] arr) {

		int max = 0;
		int secondMax = 0;
		int negativeMax = 0;
		int negativeSecondMax = 0;
		int result[] = new int[2];

		for (int i = 0; i < arr.length; i++) {

			// chech if positive number
			// if positive compare with max and second max
			if (arr[i] > 0) {
				if (arr[i] > max) {
					secondMax = max;
					max = arr[i];
				} else if (arr[i] > secondMax) {
					secondMax = arr[i];
				}
			}
			// check if negative number
			// if negative compare with negativeMax and negativeSecondMax
			else {
				if (Math.abs(arr[i]) > Math.abs(negativeMax)) {
					negativeSecondMax = negativeMax;
					negativeMax = arr[i];
				} else if (Math.abs(arr[i]) > Math.abs(negativeSecondMax)) {
					negativeSecondMax = arr[i];
				}
			}
		}

		if (Math.abs(negativeMax * negativeSecondMax) >= max * secondMax) {
			result[0] = negativeMax;
			result[1] = negativeSecondMax;
		} else {
			result[0] = max;
			result[1] = secondMax;
		}

		return result;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -10, -3, 5, 6, -2 };
		int[] result = getMaxProd(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

	
	
}