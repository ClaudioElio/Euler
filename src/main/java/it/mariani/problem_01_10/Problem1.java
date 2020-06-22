package it.mariani.problem_01_10;

/*
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {

	private static final int calc(final int max) {
		int sum = 0;
		for (int cont = 1; cont < max; cont++) {
			if ((cont % 5 == 0) || (cont % 3 == 0)) {
				sum += cont;
			}
		}
		return sum;
	}

	public static final int calc() {
//		return calc(10); // sample --> 23
		return calc(1000); // answer --> 233168
	}

}
