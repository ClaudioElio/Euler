package it.mariani.problem_11_20;

import java.util.ResourceBundle;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class Problem11 {

	private static final int NUM = 4;
	private static final int SIZE = 20;

	private static final long[][] matrix = new long[SIZE][SIZE];

	private static ResourceBundle rb = ResourceBundle.getBundle("1_50/Problem11");

	private static void load() {
		String number = rb.getString("number");
		String[] values = number.split(",");
		for (int contExt = 0; contExt < SIZE; contExt++) {
			for (int contInt = 0; contInt < SIZE; contInt++) {
				matrix[contExt][contInt] = Integer.parseInt(values[SIZE * contExt + contInt]);
			}
		}
	}

	private static final long singleCalc(int contExt, int contInt, int hor, int ver) {
		long value = matrix[contExt][contInt] * matrix[contExt + hor][contInt + ver]
				* matrix[contExt + 2 * hor][contInt + 2 * ver] * matrix[contExt + 3 * hor][contInt + 3 * ver];
		System.out.println("ext:" + contExt + ", int:" + contInt + " A: " + matrix[contExt][contInt] + " B: "
				+ matrix[contExt + hor][contInt + ver] + " C: " + matrix[contExt + 2 * hor][contInt + 2 * ver] + " D: "
				+ matrix[contExt + 3 * hor][contInt + 3 * ver] + "-> " + value);
		return value;
	}

	private static final long calc(final int digits) {
		long max = 0;
		for (int contExt = 0; contExt < digits - NUM + 1; contExt++) {
			for (int contInt = 0; contInt < digits - NUM + 1; contInt++) {
				max = Long.max(max, singleCalc(contExt, contInt, 0, 1));
				max = Long.max(max, singleCalc(contExt, contInt, 1, 0));
				max = Long.max(max, singleCalc(contExt, contInt, 1, 1));
				max = Long.max(max, singleCalc(contExt, contInt + NUM - 1, 1, -1));
			}
		}
		return max;
	}

	public static final long calc() {
		load();
		System.out.println(matrix[0]);
		return calc(20); // answer --> 70600674
	}

}
