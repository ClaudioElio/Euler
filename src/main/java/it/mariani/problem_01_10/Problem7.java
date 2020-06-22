package it.mariani.problem_01_10;

import it.mariani.commons.Functions;

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
