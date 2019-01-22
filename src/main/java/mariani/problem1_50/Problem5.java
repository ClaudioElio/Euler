package mariani.problem1_50;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 {

	private static final boolean allDiv(final int num, final int max) {
		for (int cont = 1; cont <= max; cont++) {
			if (num % cont != 0) {
				return false;
			}
		}
		return true;
	}
	
	private static final int calc(final int max) {
		int largest = 1000000000;
		for (int first = 1; first < largest; first++) {
			if(allDiv(first, max)) {
				return first;
			}
		}
		return largest;
	}

	public static final int calc() {
//		return calc(10); // answer --> 2520		
		return calc(20); // answer --> 232792560
	}

}
