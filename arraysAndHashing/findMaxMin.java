public void findMaxMin(int[] array) {

		int[] maxMinArray = new int[2];

		int max = array[0];
		int min = array[0];
		for (int el : array) {

			if (el > max) {
				max = el;
			}
			else if (el < min) {//an element that is greater than max cannot be less than min hence we can use else if instead of simple if
				min = el;
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

