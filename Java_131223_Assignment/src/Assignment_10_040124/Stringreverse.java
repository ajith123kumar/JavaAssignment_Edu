package Assignment_10_040124;

public class Stringreverse {

	 public static void main(String[] args) {
	        String myString = "Ajith Kumar";

	        System.out.println("Length of the string: " + myString.length());

	        System.out.println("Single character from the string: " + myString.charAt(0));

	        System.out.println("String in reverse: " + reverseString(myString));

	        System.out.println("3 characters of the string in reverse: " + reverseSubstring(myString, 3));
	    }

	    private static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();
	    }

	    private static String reverseSubstring(String str, int length) {
	        if (length > str.length()) {
	            return "Invalid length";
	        }

	        StringBuilder reversedSubstring = new StringBuilder();
	        for (int i = length - 1; i >= 0; i--) {
	            reversedSubstring.append(str.charAt(i));
	        }
	        return reversedSubstring.toString();
	    }

}
