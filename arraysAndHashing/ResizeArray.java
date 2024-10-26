package com.freecodecampdsa.first;

public class ResizeArray {

	public static void main(String[] args) {

		ResizeArray obj = new ResizeArray();
		int[] array = { 1, 2, 3, 4, 5 };
		obj.resize(array, 10);

	}

	public int[] resize(int[] array, int capacity) {

		int[] temp = new int[capacity];

		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array=temp;
		return array;
	}
}
