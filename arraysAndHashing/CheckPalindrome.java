package com.freecodecampdsa.first;

public class CheckPalindrome {

	public static void main(String[] args) {

		CheckPalindrome cp = new CheckPalindrome();
		String str = "Madam";
		str = str.toLowerCase();

		System.out.println(cp.checkPalindrome(str));
	}

	public boolean checkPalindrome(String str) {
		System.out.println("inside checkPalindrome");
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = charArray.length - 1;
		while (start < end) {

			if (charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}

}
