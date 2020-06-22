package it.mariani.problem_51_100;

import java.util.Arrays;

/*
* It can be seen that the number, 125874, and its double, 251748,
* contain exactly the same digits, but in a different order.
* Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
* 
*/

public class Problem52 {

	static String sort(String input) {
		char tempArray[] = input.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}

	public static final int singleCalc() {

		for (int contExt = 1; contExt < 1000000; contExt++) {
			String ordString = sort("" + contExt);
			String ordX2 = sort("" + 2 * contExt);
			String ordX3 = sort("" + 3 * contExt);
			String ordX4 = sort("" + 4 * contExt);
			String ordX5 = sort("" + 5 * contExt);
			String ordX6 = sort("" + 6 * contExt);

//			System.out.println(numStr + " " + ordStr + " " + doubleStr + " " + ordDouble);
			if (ordString.equals(ordX2) && ordString.equals(ordX3) && ordString.equals(ordX4) && ordString.equals(ordX5)
					&& ordString.equals(ordX6))
				return contExt;
		}
		return 0;
	}

	public static final long calc() {
		return singleCalc();
	}

}
