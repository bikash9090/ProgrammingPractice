package logic.developmenet.program;

import java.util.Scanner;

public class ExtractConsonant {

	public static void main(String[] args) {
		String name;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string to find the consonant: ");
		
		name = input.next();
		input.close();
		
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			}else {
				System.out.print(ch+" ");
			}
		}
	}
}
