package com.sukrutha.gpt.questions;

import java.util.Set;
import java.util.LinkedHashSet;

//Given an integer array arr[], print all distinct elements 
//from this array. The given array may contain duplicates and the output should contain every element only once.
public class PrintAllDistinctEles {

	static int[] array = { 1, 4, 6, 7, 7, 6, 4 };

	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<Integer>();

		for (int el : array) {

			s.add(el);

		}

		System.out.println(s);
	}

}
