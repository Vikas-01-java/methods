package com.mrthod.intermediatelevel;
/*
 * Write a method to check whether a string is palindrome.
*/
public class PalindromeString {
	public static void main(String[] args) {
		PalindromeString name = new PalindromeString();
		boolean result = name.PallindromeName("madam");
		System.out.println("name is palindrome or not : "+result );
	}

	 boolean PallindromeName(String w) {
		String rev="";
		for (int i=w.length()-1;i>=0;i--) {
			rev=rev+w.charAt(i);
		}
		
		if (w.equals(rev))
			return true;
		else 
			return false;
		
	}
	

}
