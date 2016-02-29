import java.util.Arrays;

// Find a number of the same words in two given texts

public class SameWords {
   
    public static void main (String[] args) {
        String StrText = "Object-oriented programming (OOP) is a programming paradigm based on the concept of objects, which are data structures that contain data, in the form of fields, often known as attributes; and code, in the form of procedures, often known as methods.";
        String StrText2 = "Object-oriented programming by definition uses objects, but not all of the associated techniques and structures are supported directly in languages which claim to support OOP. ";
        
        System.out.println("Number of the same words - " + numOfSameWords(StrText, StrText2));
    }
    
    public static int numOfSameWords(String t1, String t2) {        
        String[] a = t1.toLowerCase().split("\\W+");
        String[] b = t2.toLowerCase().split("\\W+");
        Arrays.sort(a);
        Arrays.sort(b);
        int aLen = a.length;
        int bLen = b.length;
        int sameWords = 0;
        
        for ( int i = 0; i < aLen; i++ ) {
            if ( i > 0 && a[i].equals(a[i-1]) ) {
                continue;
            }
            for ( int j = 0; j < bLen; j++ ) {
                if ( j > 0 && b[j].equals(b[j-1]) ) {
                    continue;
                }
                if ( a[i].equals(b[j]) ) {
                    sameWords += 1;
                    System.out.println("Same word: " + a[i]);
                    break;
                }
            }
        }
        
        return sameWords;
    }

}