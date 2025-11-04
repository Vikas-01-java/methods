package com.mrthod.intermediatelevel;

/**
 * Write a method to reverse a given number.
             formula 
             
             int rev = 0
             while (n != 0) {
             int rem = n % 10
             rev = (rev * 10) + remainder
             n = n / 10
             }
             return rev ;  
 */

public class ReverseMethod {
	
	public static void main(String[] args) {
		ReverseMethod r= new ReverseMethod();
		long result=r.CheckReverse(9067007047L);
		System.out.println("Reverse is : "+result);
	}

	 long CheckReverse(long l) {
		 long rev = 0;
		while (l != 0) {
			long rem = l % 10;
			rev =rev *10 + rem;
			l = l/10;
		}
		return rev;
	}

}



