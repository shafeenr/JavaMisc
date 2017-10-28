package io.github.shafeenr.dailyprogrammer;

import java.util.Scanner;

public class TheCalculator {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String equation = in.nextLine();
		in.close();
		int x = Integer.parseInt(equation.split(" ")[0]);
		int y = Integer.parseInt(equation.split(" ")[2]);
		System.out.println(x + y);
	}
}
