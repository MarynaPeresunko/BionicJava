/* 1. Find sum of an infinite row for a given x
2. Compare result with a Math.exp(x) method value:

Send code of your solution and the following data for x = 1.0 and x = 7.0:
- iterations number n
- x value
- sum value
- Math.exp(x) value
- difference between sum and Math.exp(x) */

public class Exponent {
	public static void main(String[] args){
		
    // variables
	double x = 7.0;
	double an = 1.0;
	double sum = 0.0;
	int n = 0;
	
    // while statement count
	    while (an != 0.0){
		 sum += an;
		 n++; 
		 an *= x / n; 
    //System.out.println("n = " + n + "   an = " + an + "   sum = " + sum);
			}
	System.out.println(" ");
    System.out.print("n = " + n + "    x = " + x + "    sum = " + sum);		
double exp = Math.exp(x);
   System.out.println("   exp = " + exp + "   diff = " + (sum - exp));
	}
}
