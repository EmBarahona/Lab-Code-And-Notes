package labproblems.lab2;

public class Lab2CodingBatLogic1 {
	/*
	 * Complete problems from the Logic-1 and Logic-2 sections on https://codingbat.com/java/Logic-1
	 */
	public static boolean lastDigit(int a, int b, int c) {
		int new_a = a % 10;
		int new_b = b % 10;
		int new_c = c % 10;
		
		if (new_a == new_b || new_b == new_c || new_c == new_a) {
			return true;
		} else {
			return false;
		}
	}
		
	public static void main(String[] args){
		System.out.println(lastDigit(23, 19, 13));
		System.out.println(lastDigit(23, 19, 12));
		System.out.println(lastDigit(23, 19, 3));
	}

}
