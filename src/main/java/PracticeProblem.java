/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Mikah Ho
	* Date Created: Feb 23, 2026
	* Date Last Modified: Feb 23, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here

		Boolean bool1;
		Boolean bool2;

		bool1 = true;
		bool2 = false;

		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
		
	}

	public static void q2() {
		//Write question 2 code here

		Scanner input = new Scanner(System.in);
		
		String letter;
		String letter2;

		System.out.print("Input a lowercase letter: ");
		letter = input.nextLine();
		System.out.print("Input another lowercase letter: ");
		letter2 = input.nextLine();

		System.out.println(letter.compareTo(letter2) < 0);

	}

	public static void q3() {
		//Write question 3 code here

		Scanner input = new Scanner(System.in);

		double num;

		System.out.print("Input a number: ");
		num = input.nextDouble();

		System.out.println(num >= 0 && num <= 10);

	}

	public static void q4() {
		//Write question 4 code here

		Scanner input = new Scanner(System.in);

		double num;

		System.out.print("Input a number: ");
		num = input.nextDouble();

		System.out.println(num > 0 && num != 5);

	}

	public static void q5() {
		//Write question 5 code here

		Scanner input = new Scanner(System.in);

		String word;

		System.out.print("Input a word: ");
		word = input.nextLine();

		System.out.println(word.compareTo("banana") != 0);

	}

	public static void q6() {
		//Write question 6 code here

		Scanner input = new Scanner(System.in);

		int num;

		System.out.print("Enter an integer: ");
		num = input.nextInt();

		System.out.println("The integer " + num + " is " + (num % 2 == 0));

	}

}
