package com.mrthod.intermediatelevel;

/**Write a method to calculate factorial of a number.
 * The factorial of a number n is the product of all positive integers 
 * less than or equal to n.
 * 
 *                       formula 
 *                       
 *                       int fact =1;
 *                       for(int i=1;i<=n;i++){
 *                       fact =fact*1;
 *                       }
 *                       
**/

public class Factorial {
	
	int factorialnum(int n) {
		// TODO Auto-generated method stub
		int fact=1;
		for (int i=1; i<=n ; i++) {
			fact =fact*i;
				
		}
		return fact;		
	}

	
	public static void main(String[] args) {
		Factorial num = new Factorial();		
		int result=num.factorialnum(5);
		System.out.println("factorial number = "+result);
	}	
}

