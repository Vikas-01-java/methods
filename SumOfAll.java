package com.mrthod.intermediatelevel;

/*
 * Write a method that returns the sum of digits of a number.
 *  int SumAll(int a) {
		int sum = 0;
		for (int i=1; i<=a;i++) {
			sum= sum +i;	
		}
		return sum ;

 */

public class SumOfAll {
	public static void main(String[] args) {
		SumOfAll obj = new SumOfAll();
		int result =obj.SumAll(5);
		System.out.println("Sum of all number : "+result);
	}
	 int SumAll(int a) {
		int sum = 0;
		for (int i=1; i<=a;i++) {
			sum= sum +i;	
		}
		return sum ;
	}
}
