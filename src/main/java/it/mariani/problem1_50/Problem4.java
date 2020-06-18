package it.mariani.problem1_50;

/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {

	private static final int calc(final int max) {
		int largest = 0;
		for (int first = 0; first < max; first++) {
			for (int second = 0; second < max; second++) {
				int num = first * second;
				String str = Integer.toString(num);
				String rev = new StringBuilder(str).reverse().toString();
				if (str.equals(rev)) {
					if (num > largest) {
						largest = num;
					}
				}
			}
		}
		return largest;
	}

	public static final int calc() {
//		return calc(100); // answer --> 9009		
		return calc(1000); // answer --> 906609
	}

}
