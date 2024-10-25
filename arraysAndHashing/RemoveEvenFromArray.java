package com.freecodecampdsa.first;

//removeEvenIntegers //removeIntegersatEvenIndex
public class RemoveEvenFromArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6 };
		RemoveEvenFromArray obj = new RemoveEvenFromArray();
		// obj.removeEvenIntegers(array);
		System.out.println("=================");
		obj.removeIntegersAtEvenPlaces(array);

	}

	public void removeEvenIntegers(int[] array) {

		int oddCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				oddCount++;
			}
		}

		int[] oddArray = new int[oddCount];
		int indx = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				oddArray[indx] = array[i];
				System.out.println(oddArray[indx]);
				indx++;

			}
		}

	}

	public void removeIntegersAtEvenPlaces(int[] array) {

		int oddCount = 0;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				oddCount++;
			}
		}

		int[] oddArray = new int[oddCount];
		System.out.println("odd array length" + oddArray.length);
		int x = 0;
		for (int i = 0; i < array.length; i++) {

			if (i % 2 != 0 && i < array.length) {
				System.out.println("inside odd");
				oddArray[x] = array[i];
				x++;

			}
		}
		System.out.println("elements at odd places");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.println(oddArray[i]);
		}
	}

}
