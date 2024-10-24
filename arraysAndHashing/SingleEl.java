package com.sukrutha.gpt.questions;

public class SingleEl {

	public static void main(String[] arge) {

		int[] array = { 2, 3, 5, 5, 4, 1, 2, 3, 4 };
		int res = 0;

		for (int el : array) {
			res = res ^ el;
		}
		System.out.println(res);

	}

}
