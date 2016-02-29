// Find the frequency of symbols occurrence in a given text

import java.util.Arrays;

public class Frequency {
	public static void main(String[] args) {
		String StrText = "Object-oriented programming (OOP) is a programming paradigm based on the concept of objects, which are data structures that contain data, in the form of fields, often known as attributes; and code, in the form of procedures, often known as methods.";
		char[] StrTextArray = StrText.toLowerCase().toCharArray();
		Arrays.sort(StrTextArray);
		
		int length = StrText.length();
		int n = 1;
		
		for ( int i = 0, j = 1; j < length; i ++, j ++) {
			if ( StrTextArray[j] == StrTextArray[i] ) {
				n += 1;
			} else {
		System.out.printf("'%c' found %3d times\n", StrTextArray[i], n);
		n = 1;
			}
			if (j == length - 1) {
		System.out.printf("'%c' found %3d times\n", StrTextArray[j], n);
			}
		}
	}
}