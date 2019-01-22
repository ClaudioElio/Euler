package mariani.problem1_50;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3 {

	private static final long calc(long min, final long max) {
		if (min == 1)
			min++;
		for (long cont = min; cont < max; cont++) {
			if (max % cont == 0) {
				return calc(cont, max / cont);
			}
		}
		return max;
	}

	public static final long calc() {
//		return calc(1, 30); // answer --> 5
//		return calc(1, 200); // answer --> 5
//		return calc(1, 111); // answer --> 5
		return calc(1, 600851475143L); // answer --> 6857
	}

}
