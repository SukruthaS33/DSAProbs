package com.sukrutha.gpt.questions;

public class FindSecondLargestEl {

	static int[] array = { 3, 7, 1, 8, 9, 4, 6 };

	public static void main(String[] args) {
		findSecondLargest();
		System.out.println(findSecondLargest());
	}

	public static int findSecondLargest() {

		int firstLargest = array[1];
		int secondLargest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = array[i];
			}
		}
		return secondLargest;
	}

}
