package com.sukrutha.gpt.questions;

public class FindSecondLargestEl {

	static int[] array = { 4, 7, 7, 7, 6, 5 };

	public static void main(String[] args) {
		findSecondLargest();
		System.out.println(findSecondLargest());
	}

	public static int findSecondLargest() {

		int firstLargest = -1;
		int secondLargest =-1;;

		for (int i = 1; i < array.length; i++) {
			if (array[i] > firstLargest) {//check if current element is greater than firstlargest 

				secondLargest = firstLargest;//if true assign the secondLargest to previous firstlargest because current elemnt is greater than largest
				firstLargest = array[i];//firstlargest will array[i]
			}

			else if (array[i] > secondLargest && array[i]<firstLargest) {//can also be written as array[i]!=firstlargest //but if array[i] is greater than secondLargest and also not equal to firstLargest
				secondLargest = array[i];
			}

		}
		return secondLargest;
	}

}
