package com.sukrutha.gpt.questions;

import java.util.HashSet;
import java.util.Set;

public class IsSubset {

	static int[] array = { 1, 2, 34, 5, 6, 8 };
	static int[] arrayChild = { 1, 0, 6 };

	public static void main(String[] args) {
		boolean isSubset = isSubset();
		System.out.print(isSubset);
	}

	public static boolean isSubset() {
		boolean isSubset = false;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);

		}
		for (int i = 0; i < arrayChild.length; i++) {
			if (set.contains(arrayChild[i])) {
				isSubset = true;
			} else {
				return false;
			}
		}

		return isSubset;
	}

}
