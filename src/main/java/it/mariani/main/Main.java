package it.mariani.main;

import it.mariani.problem_01_10.Problem1;
import it.mariani.problem_01_10.Problem10;
import it.mariani.problem_01_10.Problem2;
import it.mariani.problem_01_10.Problem3;
import it.mariani.problem_01_10.Problem4;
import it.mariani.problem_01_10.Problem5;
import it.mariani.problem_01_10.Problem6;
import it.mariani.problem_01_10.Problem7;
import it.mariani.problem_01_10.Problem8;
import it.mariani.problem_01_10.Problem9;
import it.mariani.problem_11_20.Problem11;
import it.mariani.problem_11_20.Problem12;
import it.mariani.problem_11_20.Problem13;
import it.mariani.problem_11_20.Problem14;
import it.mariani.problem_11_20.Problem15;
import it.mariani.problem_11_20.Problem16;
import it.mariani.problem_11_20.Problem18;
import it.mariani.problem_11_20.Problem20;
import it.mariani.problem_21_30.Problem22;
import it.mariani.problem_21_30.Problem27;
import it.mariani.problem_51_100.Problem52;

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
//		System.out.println("Problem 3:" + Problem3.calc());
//		System.out.println("Problem 4:" + Problem4.calc());
//		System.out.println("Problem 5:" + Problem5.calc());
//		System.out.println("Problem 6:" + Problem6.calc());
//		System.out.println("Problem 7:" + Problem7.calc());
//		System.out.println("Problem 8:" + Problem8.calc());
//		System.out.println("Problem 9:" + Problem9.calc());
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

