package mariani.problem1_50;


/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product a*b*c.
 */

public class Problem9 {

	private static final long calc(final int limit) {
		int limitSqr = limit * limit;
		for (int contA = 1;  contA < limit; contA++) {
			for (int contB = 1;  contB < limit; contB++) {
				if (contA + contB < limit) {
					int first = (2 * limit)*(contA + contB) - 2 * contA * contB;
					if (first == limitSqr) {
						return contA * contB * (limit - contA - contB);
					}
					
				}
			}
		}
		return 0;
	}

	public static final long calc() {
//		return calc(12); // answer --> 60
		return calc(1000); // answer --> 23514624000
	}

}
