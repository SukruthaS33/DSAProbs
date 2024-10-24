package com.freecodecampdsa.first;

public class TimeComplexityDemo {

	public static void main(String[] args) {

		TimeComplexityDemo demo1 = new TimeComplexityDemo();
		double now = System.nanoTime();

		demo1.findSum(1000);
		System.out.println(System.nanoTime() - now +"ns");
		demo1.findSum2(4);
		System.out.println(System.nanoTime() - now+"ns");

	}

	public int findSum(int n) {

		return n * (n + 1) / 2;

	}

	public int findSum2(int n) {

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
