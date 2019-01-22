package mariani.problem1_50;

import java.util.ResourceBundle;

/*
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */

public class Problem8 {

	private static ResourceBundle rb = ResourceBundle.getBundle("Problem8");

	private static final long calc(final int digits) {
		String number = rb.getString("number");
		int len = number.length();
		long max = 0;
		for (int contExt = 0;  contExt < len - digits; contExt++) {
			long mult = 1;
			for (int contInt = 0; contInt < digits; contInt++) {
				mult *= Integer.parseInt(number.substring(contInt + contExt, contInt + contExt + 1));
			}
			if (mult > max) {
				max = mult;
			}
		}
		return max;
	}

	public static final long calc() {
//		return calc(2); // answer --> 81
//		return calc(4); // answer --> 5832
		return calc(13); // answer --> 23514624000
	}

}
