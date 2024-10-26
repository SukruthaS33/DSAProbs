public void findMaxMin(int[] array) {

		int[] maxMinArray = new int[2];

		int max = array[0];
		int min = array[0];
		for (int el : array) {

			if (el > max) {
				max = el;
			}
			if (el < min) {
				min = el;
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

