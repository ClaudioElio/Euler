package it.mariani.problem_11_20;

import java.util.ResourceBundle;

/*
* 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
* What is the sum of the digits of the number 2^1000?
* 
* 2^1000 =
* 10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376
* 
*/

public class Problem16 {

	private static ResourceBundle rb = ResourceBundle.getBundle("1_50/Problem16");


	public static final int singleCalc() {

		String number = rb.getString("number");
		int sum = 0;
		int len = number.length();
		for (int cont = 0; cont < len; cont++) {
			int value = Character.getNumericValue(number.charAt(cont));
			sum += value;
		}
		return sum;
	}

	public static final long calc() {
		return singleCalc();
	}

}
