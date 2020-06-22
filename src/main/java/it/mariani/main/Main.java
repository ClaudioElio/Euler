package it.mariani.main;

import it.mariani.problem_11_20.Problem12;
import it.mariani.problem_11_20.Problem15;
import it.mariani.problem_11_20.Problem18;
import it.mariani.problem_11_20.Problem19;
import it.mariani.problem_21_30.Problem21;

public class Main {

public static int calc(int n) {
	if (n >= 1000) {
		return n - 3;
	} else {
		return calc(calc(n + 5));
	}
}

	public static void main(String[] args) {
//		System.out.println("Problem 01:" + Problem01.calc());		// OK
//		System.out.println("Problem 02:" + Problem02.calc());		// OK
//		System.out.println("Problem 03:" + Problem03.calc());		// OK
//		System.out.println("Problem 04:" + Problem04.calc());		// OK
//		System.out.println("Problem 05:" + Problem05.calc());		// OK
//		System.out.println("Problem 06:" + Problem06.calc());		// OK
//		System.out.println("Problem 07:" + Problem07.calc());		// OK
//		System.out.println("Problem 08:" + Problem08.calc());		// OK
//		System.out.println("Problem 09:" + Problem09.calc());		// OK
//		System.out.println("Problem 10:" + Problem10.calc());		// OK

//		System.out.println("Problem 11:" + Problem11.calc());		// OK
//		System.out.println("Problem 12:" + Problem12.calc());
//		System.out.println("Problem 13:" + Problem13.calc());		// OK
//		System.out.println("Problem 14:" + Problem14.calc());		// OK
//		System.out.println("Problem 15:" + Problem15.calc());
//		System.out.println("Problem 16:" + Problem16.calc());		// OK
//		System.out.println("Problem 17:" + Problem17.calc());
//		System.out.println("Problem 18:" + Problem18.calc());		// OK
//		System.out.println("Problem 19:" + Problem19.calc());		// OK
//		System.out.println("Problem 20:" + Problem20.calc());		// OK

		System.out.println("Problem 21:" + Problem21.calc());		// OK
//		System.out.println("Problem 22:" + Problem22.calc());		// OK
//		System.out.println("Problem 27:" + Problem27.calc());

//		System.out.println("Problem 52:" + Problem52.calc());		// OK
//		System.out.println(calc(85));

	}
}

