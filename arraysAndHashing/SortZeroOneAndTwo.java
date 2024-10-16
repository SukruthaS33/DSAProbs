package com.sukrutha.gpt.questions;

public class SortZeroOneAndTwo {

	static int[] array = { 0, 1, 1, 2, 0 };

	public static void main(String[] args) {
		sortZeroOneTwo();
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
	}

	public static void sortZeroOneTwo() {
		int temp;
		int lastIndex = -1;
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				// int temp2 = array[i];
				System.out.println(" vlaues " + i + array[i]);
				int lastEl = array[i];
				for (int k = i; k >= lastIndex; k--) {
					array[k] = array[k - 1];
				}

				array[lastIndex] = lastEl;

			}

			else if (lastIndex == -1) {
				lastIndex = i;
				System.out.println("lastIndex " + i);
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
