package com.mrthod.intermediatelevel;
/**
 * Write a method that counts the number of digits in a number.
                  
                    formula 
                    int count = 0;
                    while (a !=0){
                    a = a/10;
                    count++
                    }
                    return count ;
 * 
 * */
public class CountDigit {
	public static void main(String[] args) {
		CountDigit digit = new CountDigit();
		 long result = digit.CountNumber(9067007047l);
		System.out.println("counting number in digits are : "+result);
	}

	 int CountNumber(long a) {
		int count = 0;
		while (a !=0) {
			a =a/10;
			count++;
		}
		return count;
	}

}
