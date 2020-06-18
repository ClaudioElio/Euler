package it.mariani.main;

import it.mariani.problem1_50.Problem1;
import it.mariani.problem1_50.Problem10;
import it.mariani.problem1_50.Problem11;
import it.mariani.problem1_50.Problem2;
import it.mariani.problem1_50.Problem27;
import it.mariani.problem1_50.Problem3;
import it.mariani.problem1_50.Problem4;
import it.mariani.problem1_50.Problem5;
import it.mariani.problem1_50.Problem6;
import it.mariani.problem1_50.Problem7;
import it.mariani.problem1_50.Problem8;
import it.mariani.problem1_50.Problem9;

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
		System.out.println("Problem 11:" + Problem11.calc());
//		System.out.println(calc(85));
//		System.out.println("Problem 27:" + Problem27.calc());

	}
}
