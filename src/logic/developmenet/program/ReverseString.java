package logic.developmenet.program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to reverse it.");
		
		str = input.next();
		input.close();
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
