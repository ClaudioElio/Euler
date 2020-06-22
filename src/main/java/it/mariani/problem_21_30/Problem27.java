package it.mariani.problem_21_30;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Euler discovered the remarkable quadratic formula: n^2 + n + 41
 * It turns out that the formula will produce 40 primes for the consecutive integer values 0≤n≤39.
 * However, when n=40, 40^2 + 40 + 41 = 40 * (40 + 1) + 41 is divisible by 41,
 * and certainly when n=41, 41^2 + 41 + 41 is clearly divisible by 41.
 * The incredible formula n^2 − 79n + 1601 was discovered, which produces 80 primes for the consecutive values 0≤n≤79.
 * The product of the coefficients, −79 and 1601, is −126479.
 * Considering quadratics of the form:
 * n^2 + an + b, where |a|<1000 and |b|≤1000
 * where |n| is the modulus/absolute value of n
 * Find the product of the coefficients, a and b, for the quadratic expression
 * that produces the maximum number of primes for consecutive values of n, starting with n=0.
 */

public class Problem27 {

	static final int MAX = 1000000;
	static Set<Long> primes;

	static long primesV[] = new long[MAX];
	static int lastPrime = 0;

	static {
		initPrimes();
		Long[] boxedArr = Arrays.stream(primesV).boxed().toArray(Long[]::new);
		primes = Stream.of(boxedArr).collect(Collectors.toSet());
	}

	private static void initPrime(long value) {
		for (int cont = 0; cont < lastPrime; cont++) {
			if (value % primesV[cont] == 0) {
				return;
			}
		}
		primesV[lastPrime] = value;
		lastPrime++;
	}

	private static boolean isPrime(long value) {
		return primes.contains(value);
	}

	private static void initPrimes() {
		for (int cont = 2; cont < MAX; cont++) {
			initPrime(cont);
		}
	}

	private static final long calc(final int limit) {
		long sum = 0;
		for (int cont = 2;  cont < limit; cont++) {
			if(isPrime(cont)) {
				sum += cont;
			}
		}
		return sum;
	}

	public static final long calc() {
//		return calc2(10); // answer --> 17
//		return calc2(1000); // answer --> 76127
		return calc(2000000); // answer --> 142913828922
	}

}
