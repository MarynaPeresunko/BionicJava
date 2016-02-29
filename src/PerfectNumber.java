public class PerfectNumber {
	
    public static void main(String args[]) {
    	
    System.out.println("First five Perfect numbers ");
      for (int i = 1; i <= 33550336; i++) {
            test1(i);
      }
    }
    public static void test1(int n) {
    
    int sum = 0;
      for(int j=1; j < n; j++) {
    if ((n % j) ==0) {
         sum = sum + j;
      }
   }
    if(sum==n) {
     
    System.out.println(n + " is a perfect number"); 
      }
   }
}