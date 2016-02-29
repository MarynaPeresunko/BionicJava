import java.math.*;

// Calculate n! for n from 1 to 25 using long and BigInteger variables

public class Factorial {

	public static void main(String[] args) {
		long n = factorialLong(20);
		System.out.println(n);
		
		BigInteger nBI = factorialBI(211);
		System.out.println(nBI);
	}
	static long factorialLong(long i) {
		if ( i == 1) {
			return i;
		}
		return i * factorialLong(i - 1);
	}
	static BigInteger factorialBI(int i) {
		BigInteger bi = new BigInteger ("" + i);
		
		if ( i == 1) {
			return BigInteger.ONE;
		}
		return factorialBI(i-1).multiply(bi);
	}
}