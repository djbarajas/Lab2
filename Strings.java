/**
*@Author Daniel Barajas
*@Version 1.0
*Description: This program takes in strings as arguments in the command line and performs various string methods.
*The two extra methods that I chose were isEmpty and replaceAll
*/
public class Strings {
	public static void main(String args[]) {
		for(int i = args[]; i < args.length; i++){
        System.out.println(args[i]);
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