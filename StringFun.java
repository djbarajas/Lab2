/**
*@Author Daniel Barajas
*@Version 1.0
*Description: This program takes in strings as arguments in the command line and performs various string methods.
*The two extra methods that I chose were isEmpty and replaceAll.
*/
public class StringFun {
	public static void main(String args[]) {
		String aString = "Hello";
		for(int i = 0; i < args.length; i++){
	        System.out.println("\nLength of String: " + args[i]);
	        System.out.println("Does it equal Hello? " + args[i].equals(aString));
	        //System.out.println("Finding Substrings: " + args[i].subString(0,1));
	        System.out.println("Trimming whitespace: " + args[i].trim());
	        System.out.println("Finding the FIRST index of a substring: " + args[i].indexOf("a"));
	        System.out.println("Finding the LAST index of a substring: " + args[i].lastIndexOf("a"));
	        System.out.println("Trimming whitespace: " + args[i].trim());
     	}
	}
}
/*
s.length() 
s.equals(otherString)
s.substring(startIndex, endIndex) 
s.trim() 
s.indexOf(subString)  
s.lastIndexOf(subString)
s.charAt(index) 
s.isEmpty()
s.replaceAll(String regex, String replacement)
*/