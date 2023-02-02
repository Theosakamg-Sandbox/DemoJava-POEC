package com.epsi.mickael.tp1;

import java.util.Scanner;

public class Tp01 {

	public static void main(String[] args) {
		System.out.println("Number :");
		String value = new Scanner(System.in).nextLine();

		int number = Integer.parseInt(value);
		double square = Math.pow(number, 2);
		System.out.println(
				String.format("Le carré de %s est %.0f", value, square));

	}

}
