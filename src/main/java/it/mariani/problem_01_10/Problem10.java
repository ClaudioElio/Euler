package it.mariani.problem_01_10;

import it.mariani.commons.Functions;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class Problem10 {


	private static final long calc(final int limit) {
		long sum = 0;
		for (int cont = 2;  cont < limit; cont++) {
			if(Functions.isPrimeVec(cont)) {
				sum += cont;
			}
		}
		return sum;
	}

	public static final long calc() {
//		return calc(10); // answer --> 17
//		return calc(1000); // answer --> 76127
//		return calc(10000); // answer --> 5736396
//		return calc(100000); // answer --> 454396537
//		return calc(200000); // answer --> 1709600813
//		return calc(300000); // answer --> 3709507114
//		return calc(500000); // answer --> 9914236195
		return calc(2000000); // answer --> 142913828922
	}

}
