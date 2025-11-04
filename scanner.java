package com.mrthod.intermediatelevel;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();         // Reads a line
        System.out.println("My name is " + name);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();              // Reads an integer
        System.out.println("Your number: " + num);

        input.close();
    }
}
