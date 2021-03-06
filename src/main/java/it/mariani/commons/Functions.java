package it.mariani.commons;

public class Functions {

	static long primes[] = new long[1000000];
	static int lastPrime = 0;

	public static boolean isPrimeVec(long value) {
		for (int cont = 0; cont < lastPrime; cont++) {
			if (value % primes[cont] == 0) {
				return false;
			}
		}
		primes[lastPrime] = value;
		lastPrime++;
		return true;
	}

	private static boolean isPrimeSimple(long value) {
		for (long cont = 2; cont < value; cont++) {
			if (value % cont == 0) {
				return false;
			}
		}
		return true;
	}

	public static long quickFactors(long value) {
		long num = 0;
		for (long cont = 1; cont <= Math.sqrt(value); cont++) {
			if (value % cont == 0) {
				if (value / cont == cont) {
					num++;
				} else {
					num += 2;
				}
			}
		}
		return num;
	}

	public static long numFactors(long value) {
		long num = 0;
		for (long cont = 1; cont <= value; cont++) {
			if (value % cont == 0) {
				num++;
			}
		}
		return num;
	}

	public static long sumFactors(long value) {
		long sum = 0;
		for (long cont = 1; cont < value; cont++) {
			if (value % cont == 0) {
				sum += cont;
			}
		}
		return sum;
	}

	public static boolean isPrime(long value) {
		return isPrimeSimple(value);
	}

	public long factorial(int value) {
		if (value <= 2) {
			return value;
		}
		return value * factorial(value - 1);
	}

}
