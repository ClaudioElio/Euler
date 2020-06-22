package it.mariani.problem_11_20;

import java.util.ResourceBundle;

/*
* n! means n × (n - 1) × ... × 3 × 2 × 1
* For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
* and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
* Find the sum of the digits in the number 100!
* 100! =
* 10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376
* 
*/

public class Problem20 {

	private static ResourceBundle rb = ResourceBundle.getBundle("1_50/Problem20");


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
