package logic.developmenet.program;

public class PowerOfNumber {

	public static void main(String[] args) {
		int base = 2;
		int exponent = 12;
		long result = 1;
		
		for(int i=0;i<exponent;i++) {
			result *= base;
		}
		System.out.println(result);
		System.out.println((int)Math.pow(base, exponent));
	}

}