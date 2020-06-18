package it.mariani.problem1_50;

/*
 * The sum of the squares of the first ten natural numbers is,
 *           1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *           (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Problem6 {

	private static final int contSquareSum(final int max) {
		int sum = 0;
		for (int cont = 1; cont <= max; cont++) {
			sum += cont * cont;
		}
		return sum;
	}

	private static final int contSumSquare(final int max) {
		int sum = 0;
		for (int cont = 1; cont <= max; cont++) {
			sum += cont;
		}
		return sum * sum;
	}

	private static final int calc(final int max) {
		return contSumSquare(max) - contSquareSum(max);
	}

	public static final int calc() {
//		return calc(10); // answer --> 2640
		return calc(100); // answer --> 25164150
	}

}
