package it.mariani.main;

import it.mariani.problem_01_10.Problem01;
import it.mariani.problem_01_10.Problem02;
import it.mariani.problem_01_10.Problem03;
import it.mariani.problem_01_10.Problem04;
import it.mariani.problem_01_10.Problem05;
import it.mariani.problem_01_10.Problem06;
import it.mariani.problem_01_10.Problem07;
import it.mariani.problem_01_10.Problem08;
import it.mariani.problem_01_10.Problem09;
import it.mariani.problem_01_10.Problem10;
import it.mariani.problem_11_20.Problem11;
import it.mariani.problem_11_20.Problem12;
import it.mariani.problem_11_20.Problem13;
import it.mariani.problem_11_20.Problem14;
import it.mariani.problem_11_20.Problem15;
import it.mariani.problem_11_20.Problem16;
import it.mariani.problem_11_20.Problem18;
import it.mariani.problem_11_20.Problem19;
import it.mariani.problem_11_20.Problem20;
import it.mariani.problem_21_30.Problem21;
import it.mariani.problem_21_30.Problem22;
import it.mariani.problem_21_30.Problem24;
import it.mariani.problem_21_30.Problem27;
import it.mariani.problem_41_50.Problem48;
import it.mariani.problem_51_60.Problem52;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

public static int calc(int n) {
	if (n >= 1000) {
		return n - 3;
	} else {
		return calc(calc(n + 5));
	}
}

	public static void main(String[] args) {
		log.debug("start");

//		log.debug("Problem 01: {}", Problem01.calc());		// OK
//		log.debug("Problem 02: {}", Problem02.calc());		// OK
//		log.debug("Problem 03: {}", Problem03.calc());		// OK
//		log.debug("Problem 04: {}", Problem04.calc());		// OK
//		log.debug("Problem 05: {}", Problem05.calc());		// OK
//		log.debug("Problem 06: {}", Problem06.calc());		// OK
//		log.debug("Problem 07: {}", Problem07.calc());		// OK
//		log.debug("Problem 08: {}", Problem08.calc());		// OK
//		log.debug("Problem 09: {}", Problem09.calc());		// OK
//		log.debug("Problem 10: {}", Problem10.calc());		// OK

//		log.debug("Problem 11: {}", Problem11.calc());		// OK
//		log.debug("Problem 12: {}", Problem12.calc());
//		log.debug("Problem 13: {}", Problem13.calc());		// OK
//		log.debug("Problem 14: {}", Problem14.calc());		// OK
//		log.debug("Problem 15: {}", Problem15.calc());		// OK
//		log.debug("Problem 16: {}", Problem16.calc());		// OK
//		log.debug("Problem 17: {}", Problem17.calc());
//		log.debug("Problem 18: {}", Problem18.calc());		// OK
//		log.debug("Problem 19: {}", Problem19.calc());		// OK
//		log.debug("Problem 20: {}", Problem20.calc());		// OK

//		log.debug("Problem 21: {}", Problem21.calc());		// OK
//		log.debug("Problem 22: {}", Problem22.calc());		// OK
//		log.debug("Problem 24: {}", Problem24.calc());		// OK
//		log.debug("Problem 27: {}", Problem27.calc());		// OK

//		log.debug("Problem 48: {}", Problem48.calc());		// OK

//		log.debug("Problem 52: {}", Problem52.calc());		// OK

//		System.out.println(calc(85));

	}
}

