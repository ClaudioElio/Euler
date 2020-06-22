package it.mariani.problem_21_30;

import it.mariani.commons.Functions;

/*
* Let d(n) be defined as the sum of proper divisors of n
* 		(numbers less than n which divide evenly into n).
* If d(a) = b and d(b) = a, where a <> b, then a and b are an amicable pair
* 		and each of a and b are called amicable numbers.
* For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
* therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
* 
* Evaluate the sum of all the amicable numbers under 10000.
* 
*/

public class Problem21 {

	private static final int MAX = 10001;

	public static final long singleCalc() {

		long totalSum = 0;
		
		for (int cont = 0; cont < MAX; cont++) {
			long sum = Functions.sumFactors(cont);
			System.out.println("c:" + cont + " s:" + sum);
			if ((sum < 10000) && (sum != cont)) {
				long friend = Functions.sumFactors(sum);
				System.out.println("f:" + friend);
				if (friend == cont) {
					System.out.println("WOW:" + friend);
					totalSum += cont;
				}
			}
		}
		return totalSum;
	}

	public static final long calc() {
		return singleCalc();
	}

}
