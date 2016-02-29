// Find sum of command line arguments supposing they are integers

public class Exceptions {
	
	public static void main(String[] args) {
	 try {
		 int n = args.length;
		 int sum = 0 ;
		 for ( int i = 0; i < n; i++ ) {
			 sum += Integer.parseInt(args[i]);
		 }
		 System.out.println("Sum = " + sum);
	 }
	 catch (NumberFormatException nf){
		 System.out.println("Oops, try again. The value format should be an integer.");
		 return;
	 }
	}
}
