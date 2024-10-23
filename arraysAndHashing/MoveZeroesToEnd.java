package com.sukrutha.gpt.questions;

public class MoveZeroesToEnd {

	static int[] array = { 1, 2, 0, 4, 5, 6, 0, 0, 3 };

	public static void main(String[] args) {

		int[] arrayNew = new int[array.length];
		moveZeroesToEnd(arrayNew);

	}

	static void moveZeroesToEnd(int[] arrayNew) {
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				arrayNew[j++] = array[i];
			}

		}

		while (j < array.length) {
			arrayNew[j++] = 0;
		}
		for (int el : arrayNew) {
			System.out.println(el);
		}

	}

	static void moveZeroesToEnd() {

		int countNonZero = 0;
		int[] array2 = { 1, 2, 0, 4, 5, 6, 0, 0, 3 };

		for (int i = 0; i < array2.length; i++) {
			if (array[i] != 0) {
				array[countNonZero] = array2[i];
				countNonZero++;
			}

		}

		for (int i = countNonZero; i < array2.length; i++) {
			array[i] = 0;
		}

		for (int el : array) {
			System.out.println(el);
		}

	}

	static void moveZeroesToBeginning() {

	}

}
