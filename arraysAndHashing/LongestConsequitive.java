package com.w3schools.sukrutha.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsequitive {

	public static void main(String[] args) {
		int arr[] = {11,12,13,14, 4, 8, 9, 10, 5, 1, 2, 3, 1, 99, 100, 101, 102, 103, 104, 105, 106,0,1,2,3,4,5,6,7,8,9,10 };// 1,2,3,5,8,9,10
		// {1,4} only one or {4}, or n or n3
		System.out.println(longestConsecutive(arr));
	}

	public static int longestConsecutive(int[] nums) {
		int conseqCnt = 0;

		Set<Integer> HashSet = new HashSet<Integer>();
		// O(n)
		for (int i = 0; i < nums.length; i++) {
			HashSet.add(nums[i]);// creating list from int array
		}
	   List<Integer> mainList = new ArrayList<>();
	   mainList.addAll(HashSet);
	   Collections.sort(mainList);
		// loop through arraylist to check diff between two elements , for now we are
		// not converting to set to remove duplicates
		int diff;
		int largestConsequtive = 0;
		// sort the list
		Collections.sort(mainList);// {5,8,9,10}
		List<Set<Integer>> nestedAl = new ArrayList<>();
		Set<Integer> internalList = new HashSet<>();

		// List<Integer> tempInternalList = new ArrayList<>();make this a set
		Set<Integer> tempInternalSet = new HashSet<Integer>();
		for (int i = 0; i < mainList.size() - 1; i++) {

			System.out.println("Inside for " + mainList.get(i));
			// get the difference between first and next element in sorted list

			diff = mainList.get(i + 1) - mainList.get(i);
			// if diff is 1 meaning consequtive add to the internal list
			if (diff == 1) {
				System.out.println("diff is 1 for " + mainList.get(i));
				internalList.add(mainList.get(i));
				internalList.add(mainList.get(i + 1));

				System.out.println(internalList);

				if (i == mainList.size() - 2) {
					System.out.println("adding " + internalList);
					nestedAl.add(internalList);
					largestConsequtive = calculateLargest(internalList.size(), largestConsequtive);
				}
			}
			// if diff is greater than or less than 1 stop adding to internal list and add
			// the internal list to the nested list

			else if (i > 1 || i < 1) {
				System.out.println("inside else if");

				tempInternalSet = new HashSet<>(internalList);// make this a set?
				// System.out.println("tempInternalList " + tempInternalSet);
				System.out.println("adding " + tempInternalSet);
				nestedAl.add(tempInternalSet);
				int internalListSize = tempInternalSet.size();
				System.out.println("largest " + internalListSize);
				// add the internal list to nestedAl
				largestConsequtive = calculateLargest(internalListSize, largestConsequtive);

				internalList.clear();

			}
			System.out.println(tempInternalSet);
			System.out.println("================loop ends here====================");

		}
		System.out.println(nestedAl);
		return largestConsequtive;

		// o(n)

	}

	static int calculateLargest(int internalListSize, int largestConsequtive) {
		if (internalListSize > largestConsequtive) {// get the size of this list and check if it's greater than
			// largestConsequtive we created and added previously
			largestConsequtive = internalListSize;

		}
		return largestConsequtive;
	}

}
