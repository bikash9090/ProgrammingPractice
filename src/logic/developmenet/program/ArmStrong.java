package logic.developmenet.program;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check Arm Strong or not.");

		int number, originalnumber, remainder, result = 0;

		number = input.nextInt();
		input.close();

		originalnumber = number;

		while (originalnumber != 0) {
			remainder = originalnumber % 10;
			result += Math.pow(remainder, 3);
			originalnumber /= 10;
		}

		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}

}
