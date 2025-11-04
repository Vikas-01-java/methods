package com.mrthod.intermediatelevel;

// Write a method to find the smallest element in an array.
/* 
 * */

public class SmallestElement {
	public static void main(String[] args) {
		int [] number= {10,20,30,40,50,1,2,3};
		int smallest = FindSmallest(number);
		System.out.println("the samllest no. is : "+smallest);
	}
	
	static int FindSmallest(int [] arr) {
		int smallest =arr[0];
		for (int i = 1;i<arr.length;i++) {
			if (arr[i]<smallest) {}
			smallest =arr[i];
		}
		return smallest;
	}
	

}
