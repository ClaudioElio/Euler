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

	public static boolean isPrimeSimple(long value) {
		for (long cont = 2; cont < value; cont++) {
			if (value % cont == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(long value) {
		return isPrimeSimple(value);
	}

}
