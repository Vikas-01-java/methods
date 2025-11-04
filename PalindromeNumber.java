package com.mrthod.intermediatelevel;

//import java.util.Scanner;

/*
 * Write a method to find whether a given number is palindrome.
 * A palindrome is a number, word, or string that reads the same forward 
 * and backward.
 *                               
 *                      formula
 *                      int original =i;
 *                      int rev =0;
 *                      while (i!=0){
 *                      int rem=i% 10;
 *                      rev =rev *10+rem;
 *                      i=i/10;
 *                      }
 *                      return rev =original;
 *                     
 */

public class PalindromeNumber {
	
	public static void main(String[] args) {
		PalindromeNumber obj = new PalindromeNumber();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number : ");
		boolean result = obj.CheckPalindrome(121);
		System.out.println("Palindrome :"+ result );
	}

	 boolean CheckPalindrome(int i) {
		 int original = i;
		 int  rev=0;
		 
		while(i != 0) {
			int rem= i %10;
			 rev = rev * 10 + rem;
		     i = i/10;
		}
		return rev == original;
	}

}
