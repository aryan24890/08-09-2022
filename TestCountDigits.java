package com.testexam.pll;

import java.util.Scanner;

import com.testexam.bll.CountDigits;

public class TestCountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			CountDigits c1 = new CountDigits();
			
			System.out.println("Enter positive number");
			int num=sc.nextInt();
			if(num>=0) {
				System.out.println("Number of digit is :"+c1.countDigits(num));
			}
			else {
				System.out.println("Invilide input");
			}
		sc.close();

	}

}
