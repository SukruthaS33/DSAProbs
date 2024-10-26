package com.freecodecampdsa.first;

public class FindMissingNumber {

	public static void main(String[] args) {
		FindMissingNumber fmn = new FindMissingNumber();
		int[] array = { 1, 2, 4, 5, 6 };
		fmn.findMissingNumber(array);
	}

	public void findMissingNumber(int[] array) {

		
		
		int n = array.length;
		int sum = 0;
		for(int i=0;i<array.length;i++)
		{
			sum = sum+array[i];//calculating the actual sum
			
		}
		int supposedSum = n*(n+1)/2;//calculating the supposed sum if the lenght is n
		
		int missingNumber=sum-supposedSum;//this will give us the number that is missing, in this case the number that should have been present must be 3 but isntead 6 is there 
		System.out.println(missingNumber);
	}
}
