package it.mariani.problem_41_50;

import java.math.BigInteger;
import java.util.Arrays;

/*
* It can be seen that the number, 125874, and its double, 251748,
* contain exactly the same digits, but in a different order.
* Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
* 
*/

public class Problem48 {

	public static final int singleCalc() {

		for (int contExt = 1; contExt < 1000000; contExt++) {
		}
		return 0;
	}

	public static final long calc() {
		BigInteger tot = BigInteger.valueOf(100);
		BigInteger bi = BigInteger.valueOf(100);
		for (int cont = 1; cont < 100; cont++) {
			bi.multiply(bi);
		}
		return 100^10;
	}

}
