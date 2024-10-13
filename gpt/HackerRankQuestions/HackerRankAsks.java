package com.sukrutha.gpt.questions;

public class HackerRankAsks {

	public static void main(String[] args) {

// reverse an array
		int[] array = { 1, 2, 3, 4, 5,78,23,32,32,64,6 };
		int arrLength = array.length;
		int lengthEven = arrLength % 2;// remainder is returned
		int skipAt = -1;
		int j = arrLength - 1;
		boolean isLengthEven = false;
		if (lengthEven == 0) {
			System.out.println("inside if");
			isLengthEven = true;
		} else {
			System.out.println("inside else");
			skipAt = arrLength / 2;
		}

		for (int i = 0; i < array.length; i++) {
			if (i != skipAt && i != array.length / 2) {

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				System.out.println(array[i]);
				System.out.println(array[j]);
				System.out.println("arrange done");
				j--;

			} else {
				System.out.println("inside else");
				break;
			}
		}
		System.out.println("===================");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
