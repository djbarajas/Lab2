/**
*@Author Daniel Barajas
*@Version 1.0
*Description: This program takes in strings as arguments in the command line and performs various string methods.
*The two extra methods that I chose were isEmpty and replaceAll.  isEmpty checks if the string has any characters
*and if not it returns true. I also chose replaceAll which replaces a character or part of a string with another of 
*your choosing.
*/
public class StringFun {
	public static void main(String args[]) {
		String aString = "Hello";
		for(int i = 0; i < args.length; i++){
	        System.out.println("\nLength of String: " + args[i].length());
	        System.out.println("Does it equal Hello? " + args[i].equals(aString));
	        //System.out.println("Finding Substrings: " + args[i].substring(1));
	        System.out.println("Trimming whitespace: " + args[i].trim());
	        System.out.println("Finding the FIRST index of letter a: " + args[i].indexOf("a"));
	        System.out.println("Finding the LAST index of letter a: " + args[i].lastIndexOf("a"));
	        // this try catch statement was for when I tested a null string, an error was thrown
	        try{
	        	System.out.println("Character at index 0: " + args[i].charAt(0));
	    	} catch (StringIndexOutOfBoundsException e){
	    		System.out.println("This string has no characters!");
	    	}
	        System.out.println("Is the string empty: " + args[i].isEmpty());
	        System.out.println("Replacing all instances of t with +: " + args[i].replaceAll("t","+"));
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