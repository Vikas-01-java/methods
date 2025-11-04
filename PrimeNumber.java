package com.mrthod.intermediatelevel;

/**Write a method to check whether a number is prime.
*A prime number is a natural number greater than 1 
that is divisible only by 1 and itself — meaning it has exactly two

*key points::
=>Smallest prime number: 2 (also the only even prime number)
=>All other even numbers are not prime, since they are divisible by 2.
=>A number is not prime if it has any divisor other than 1 and itself.


                  formula for prime 
                 ====================
             boolean checkPrime (parameter a ){
             if (a>=1){
             return false ;
             }
             
             for (int i =2;i*i<=a;i++){
             if (a%i==0){
             return false;
             }
             return true ;
             }

*/

public class PrimeNumber {
	boolean show(int a) {
		if (a<=1) {
			return false;
		}
		 for (int i=2; i*i<=a ; i++) {
			 if(a%i==0) {
				 return false ;
			 }
			}
		return true ;
	}
	

	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		boolean reasult=obj.show(8);
		System.out.println("the number is prime = "+reasult);
	}
}




/**
 * 
 public class PrimeNumber {

    // Method to check if a number is prime
    boolean isPrime(int n) {
        if (n <= 1) {
            return false; // numbers <=1 are not prime
        }
        for (int i = 2; i * i <= n; i++) { // check up to √n
            if (n % i == 0) {
                return false; // divisible → not prime
            }
        }
        return true; // prime
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();

        int num1 = 7;
        int num2 = 10;

        System.out.println(num1 + " is prime? " + obj.isPrime(num1));
        System.out.println(num2 + " is prime? " + obj.isPrime(num2));
    }
}

 */
