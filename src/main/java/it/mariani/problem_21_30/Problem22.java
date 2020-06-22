package it.mariani.problem_21_30;

import java.util.Arrays;
import java.util.ResourceBundle;

/*
* Using names.txt (right click and 'Save Link/Target As...'),
* a 46K text file containing over five-thousand first names,
* begin by sorting it into alphabetical order.
* Then working out the alphabetical value for each name,
* multiply this value by its alphabetical position in the list to obtain a name score.
* For example, when the list is sorted into alphabetical order,
* COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
* So, COLIN would obtain a score of 938 × 53 = 49714.
* What is the total of all the name scores in the file?
* 
*/

public class Problem22 {

	private static ResourceBundle rb = ResourceBundle.getBundle("1_50/Problem22");


	public static final int singleCalc() {

		String namesStr = rb.getString("names");
		String[] names = namesStr.split(",");
		Arrays.sort(names);
		int len = names.length;
		int globalSum = 0;
		for (int contExt = 0; contExt < len; contExt++) {
			String name = names[contExt];
			int sum = 0;
			for (int contInt = 0; contInt < name.length(); contInt++) {
				int value = name.charAt(contInt) - 64;
				sum += value;
				System.out.println("name: " + name + " value: " + value);
			}
			System.out.println("name: " + name + " sum: " + sum);
			sum = sum * (contExt + 1);
			globalSum += sum;
		}
		return globalSum;
	}

	public static final long calc() {
		return singleCalc();
	}

}
