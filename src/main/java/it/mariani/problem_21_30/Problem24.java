package it.mariani.problem_21_30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* A permutation is an ordered arrangement of objects.
* For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
* If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
* The lexicographic permutations of 0, 1 and 2 are:
* 012   021   102   120   201   210
* 
* What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
* 
*/

public class Problem24 {

	private static void swap(String[] input, int a, int b) {
		String tmp = input[a];
		input[a] = input[b];
		input[b] = tmp;
	}

	private static void printArray(String[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
		}
		System.out.println("");
	}

	public static long printAllOrdered(String[] elements) {

		Arrays.sort(elements);
		boolean hasNext = true;
		int num = 0;
		
		while (hasNext) {
			num++;
			if (num == 1000000) {
				printArray(elements);
			}
			int k = 0, l = 0;
			hasNext = false;
			for (int i = elements.length - 1; i > 0; i--) {
				if (elements[i].compareTo(elements[i - 1]) > 0) {
					k = i - 1;
					hasNext = true;
					break;
				}
			}

			for (int i = elements.length - 1; i > k; i--) {
				if (elements[i].compareTo(elements[k]) > 0) {
					l = i;
					break;
				}
			}

			swap(elements, k, l);
			Collections.reverse(Arrays.asList(elements).subList(k + 1, elements.length));

		}
		return num;
	}

//	public static final int singleCalc() {
//
//	}

	public static final long calc() {
		String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		long num = printAllOrdered(numbers);
		return num;
	}

}
