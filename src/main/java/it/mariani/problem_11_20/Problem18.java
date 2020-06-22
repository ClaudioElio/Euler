package it.mariani.problem_11_20;

import java.util.ResourceBundle;

/*
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below,
 * the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 */

public class Problem18 {

	private static final int SIZE = 2; //15;

	private static final int[][] numbers = new int[SIZE][SIZE];

	private static ResourceBundle rb = ResourceBundle.getBundle("1_50/Problem18");

	private static long maxSum = 0;

	private static void load() {
		for (int contExt = 0; contExt < SIZE; contExt++) {
			String row = rb.getString("row" + contExt);
			String[] values = row.split(",");
			for (int contInt = 0; contInt < values.length; contInt++) {
				numbers[contExt][contInt] = Integer.parseInt(values[contInt]);
				System.out.print(" " + numbers[contExt][contInt]);
			}
			System.out.println();
		}

	}

	public static final void singleCalc(int x, int y, long sum) {
		for (int contExt = y; contExt < SIZE; contExt++) {
			for (int contInt = x; contInt < SIZE; contInt++) {
				if (numbers[contExt][contInt] == 0)
					break;
				singleCalc(contExt + 1, contInt + 1, sum);
				sum += numbers[contExt][contInt];
			}
		}
		maxSum = Long.max(maxSum, sum);
	}

	public static final long calc() {
		load();
		singleCalc(0, 0, 0);
		return maxSum;
	}

}
