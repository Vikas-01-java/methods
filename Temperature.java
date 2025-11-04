package com.mrthod.intermediatelevel;


// Write a method to convert Celsius temperature to Fahrenheit.

   //  formula of fahrenheit =>  double fahrenheit = (cal * 9/5) + 32;
	// formula of celsius =>double celsius = (5.0 / 9) * (cal - 32);


public class Temperature {
public static void main(String[] args) {
	Temperature degree= new Temperature();
	double result= degree.calculate(133);
	System.out.println("temperatur is : "+result );	
}
 double calculate(int cal) {
	//double fahrenheit = (cal * 9/5) + 32;
	double celsius = (5.0 / 9) * (cal - 32);
	// return fahrenheit ;
	return celsius;
}
}
