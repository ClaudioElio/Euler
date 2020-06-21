package it.mariani.problem1_50;

import it.mariani.commons.Functions;

/*
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * 
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 * Let us list the factors of the first seven triangle numbers:
 * 
 *  1: 1
 *  3: 1,3
 *  6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * 
 * What is the value of the first triangle number to have over five hundred divisors?
 */

public class Problem13 {


	private static final long calc(final long min, final long max) {
		long maxFactors = 0;
		long num = 0;
		for (long cont = min; cont < max; cont++) {
			num += cont;
			maxFactors = Long.max(maxFactors, Functions.numFactors(num));
//			System.out.println(num + " " + Functions.numFactors(num));
			if (maxFactors == 501) {
				System.out.println("num: " + num + " cont: " + cont);
			}
		}
		return maxFactors;
	}

	public static final long calc() {
		return calc(20000, 30000); // answer --> 70600674
	}

}
