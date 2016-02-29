// Find and print all prime divisors of a given natural number n.

public class PrimeNumber {
    public static void main(String[] args) {
		
    long n = 72; 
      for (long i = 2; i*i <= n; i ++) {
        while (n % i == 0) {
    System.out.print(i + " "); 
    n = n / i;
   }
 }
    if (n > 1) System.out.println(n);
       else       System.out.println();
   }
}
