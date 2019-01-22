package mariani.problem1_50;

import mariani.commons.Functions;
/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

public class Problem7 {

	private static final int calc(final int max) {
		int primePosition = 1;
		for (int contExt = 3; ; contExt++) {
			if (Functions.isPrime(contExt)) {
				primePosition++;
				if (primePosition == max)
					return contExt;
			}
		}
	}


	public static final int calc() {
//		return calc(2); // answer --> 3
//		return calc(3); // answer --> 5
//		return calc(4); // answer --> 7
//		return calc(5); // answer --> 11
		return calc(10001); // answer --> 104743
	}

}
