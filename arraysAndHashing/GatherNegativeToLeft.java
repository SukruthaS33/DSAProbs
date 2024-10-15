package com.sukrutha.gpt.questions;

public class GatherNegativeToLeft {

	static int[] array = { 1, -2, 1, 4, 5, -5, -6, -1, -4, 0 };// order doesn't matter

	public static void main(String[] args) {
		GatherNegativeToLeft(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void GatherNegativeToLeft(int[] array) {
		int lastNegIndex = -1;
		int temp;
		for (int i = 1; i < array.length; i++) {
			// start from 1 because it's the right way to compare
			if (array[i] < 0 && array[i - 1] > 0) {// if the current element is less than 0 and the previous element is
				// greater than 0 then
				temp = array[i];//temp = -2
				array[i] = array[lastNegIndex + 1];
				array[lastNegIndex + 1] = temp;
				lastNegIndex++;

			}
			
			
		}
	}

}
