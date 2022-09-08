package com.testexam.bll;

import java.util.Scanner;

public class GuessPin {
	public static final int pin=6386;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int epin;
		int count=0;
		do {
			System.out.println("Enter your Pin");
			epin = sc.nextInt();
			if(epin==pin) {
				System.out.println("'Correct' welcome back");
				break;
			}
			else {
				
				if(count<2) {
					System.out.println("Incorrect pin 'Try again'");
				}
				count++;
				
			}
		}while(count<3);
		if(count==3) {
			System.out.println("******************************");
			System.out.println("Sorry you have been locked out");
		}
		sc.close();
	}

}
