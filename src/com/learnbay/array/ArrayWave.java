package com.akash.array;

public class ArrayWave
{
	
	private static int[] getWave(int[] arr) {
		boolean big = false;
		int temp = 0;

		// itertate the complete array
		for (int i = 0; i < arr.length - 1; i++) {

			// check if the wave should have bigger number or smaller,
			// if big, comare the next element to be smaller than current, else bigger than
			// current.
			if (big) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				big = false;
			} else {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				big = true;
			}

		}

		return arr;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 6, 4, 7, 8, 9, 5, 2 };

		int[] wave = getWave(arr);

		for (int i : wave) {
			System.out.print(i);
		}

	}
	
	
}