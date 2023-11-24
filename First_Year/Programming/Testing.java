//import java.util.HashMap;
//import java.util.Map;

  
public class Testing
{  
    public static void main(String args[])
    {    
    	String boots = "yass";
    	String slay = "yefs";
    	
    	boolean poop = stringCompare(boots, slay);
    	System.out.print(poop);
    }
    
    public static boolean stringCompare(String str1, String str2)
    {
    	int difference = 0;
    	if (str1.length() != str2.length()) return false;
  
        for (int i = 0; i < str1.length(); i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
  
            if (str1_ch != str2_ch) {
                difference++;
            }
        }
        if (difference == 1) return true;
        else return false;
//  
//        // Edge case for strings like
//        // String 1="Geeks" and String 2="Geeksforgeeks"
//        if (l1 != l2) {
//            return l1 - l2;
//        }
//  
//        // If none of the above conditions is true,
//        // it implies both the strings are equal
//        else {
//            return 0;
//        }
    }
} 