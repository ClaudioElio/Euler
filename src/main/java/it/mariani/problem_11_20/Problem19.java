package it.mariani.problem_11_20;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

/*
* 
* You are given the following information, but you may prefer to do some research for yourself.
* + 1 Jan 1900 was a Monday.
* + Thirty days has September,
*   April, June and November.
*   All the rest have thirty-one,
*   Saving February alone,
*   Which has twenty-eight, rain or shine.
*   And on leap years, twenty-nine.
* + A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
* 
* How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
* 
*/

public class Problem19 {

	public static final int singleCalc() {

		int sundays = 0;
		LocalDate ld = LocalDate.of(1901, 1, 1);
		
		for (int cont = 0; cont < 1199; cont++) {
			ld = ld.plusMonths(1);
			if (ld.getDayOfWeek() == DayOfWeek.SUNDAY) {
				sundays++;
			}
		}
//		System.out.println(ld);
		return sundays;
	}

	public static final long calc() {
		return singleCalc();
	}

}
