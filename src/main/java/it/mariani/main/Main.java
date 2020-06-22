package it.mariani.main;

import it.mariani.problem_11_20.Problem12;
import it.mariani.problem_11_20.Problem15;

public class Main {

public static int calc(int n) {
	if (n >= 1000) {
		return n - 3;
	} else {
		return calc(calc(n + 5));
	}
}

	public static void main(String[] args) {
//		System.out.println("Problem 1:" + Problem1.calc());
//		System.out.println("Problem 2:" + Problem2.calc());
//		System.out.println("Problem 3:" + Problem03.calc());
//		System.out.println("Problem 4:" + Problem04.calc());
//		System.out.println("Problem 5:" + Problem05.calc());
//		System.out.println("Problem 6:" + Problem06.calc());
//		System.out.println("Problem 7:" + Problem07.calc());
//		System.out.println("Problem 8:" + Problem08.calc());
//		System.out.println("Problem 9:" + Problem09.calc());
//		System.out.println("Problem 10:" + Problem10.calc());
//		System.out.println("Problem 11:" + Problem11.calc());
		System.out.println("Problem 12:" + Problem12.calc());
//		System.out.println("Problem 13:" + Problem13.calc());
//		System.out.println("Problem 14:" + Problem14.calc());
		System.out.println("Problem 15:" + Problem15.calc());
//		System.out.println("Problem 18:" + Problem18.calc());
//		System.out.println("Problem 16:" + Problem16.calc());
//		System.out.println("Problem 20:" + Problem20.calc());
//		System.out.println("Problem 22:" + Problem22.calc());
//		System.out.println("Problem 52:" + Problem52.calc());
//		System.out.println(calc(85));
//		System.out.println("Problem 27:" + Problem27.calc());

	}
}

