package it.mariani.problem_11_20;

/*
* The following iterative sequence is defined for the set of positive integers:
* 
* n --> n/2 (n is even)
* n --> 3n + 1 (n is odd)
* 
* Using the rule above and starting with 13, we generate the following sequence:
* 
* 13 --> 40 --> 20 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1
* It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
* 
* Which starting number, under one million, produces the longest chain?
* 
* NOTE: Once the chain starts the terms are allowed to go above one million.
*
*/

public class Problem14 {

	public static int num = 0;
	public static int max = 0;
	public static int value = 0;

	public static final long singleCalc(long value) {
//		System.out.println(value);
		num++;
		if (value == 1)
			return 1;
		if ((value % 2) == 0) {
			return singleCalc(value / 2);
		} else {
			return singleCalc(3 * value + 1);
		}
	}
	
	public static final long calc() {
//		singleCalc(13);

		for (int cont = 1; cont < 1000000; cont++) {
			num = 0;
			singleCalc(cont);
			if (num > max) {
				max = num;
				value = cont;
			}
			System.out.println(max);
		}
		return value;

	}

}
