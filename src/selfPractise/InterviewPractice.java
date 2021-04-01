package selfPractise;

import java.util.ArrayList;
import java.util.Scanner;

public class InterviewPractice {
	
	public static int reverse(int a) {
		String reversedString = "";
		String stringName = Integer.toString(a);
		for (int i = stringName.length() - 1; i >= 0; i -= 1) {
			char character = stringName.charAt(i);
			reversedString = reversedString + character;
		}
		return Integer.parseInt(reversedString);
	}
	 

	public static int factorial(int number) {
		int a = 1;
		for (int i = 1; i <= number; i += 1) {
			a = a * i;
		}
		return a;

	}

	public static int recurssionFatorial(int number) {
		if (number == 0) {
			return 1;
		}
		return number * recurssionFatorial(number - 1);
	}

	public static int recurssionfibonacci(int number) {

		if (number == 1 || number == 2) {
			return 1;
		}
		return recurssionfibonacci(number - 2) + recurssionfibonacci(number - 1);

	}

	public static int fibonacci(int number) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);

		for (int i = 2; i < number; i++) {
			int newNum = list.get(i - 2) + list.get(i - 1);
			list.add(newNum);
		}
		return list.get(number - 1);
	}

	public static boolean armstrong(int number) {
		int sum = 0;
		String stringNumber = Integer.toString(number);
		for (int i = 0; i < stringNumber.length(); i++) {
			int r = Character.getNumericValue(stringNumber.charAt(i));
			sum = sum + r * r * r;

		}

		if (sum == number) {
			return true;
		}
		return false;
	}

	public static boolean palindrome(String num) {
		int b = num.length() / 2;

		for (int i = 0; i < 5; i++) {
			if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
				return false;
			}

		}
		return true;
	}

	public static boolean primeNumber(int number) {
		if (number == 1) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		int squareRootNumber = (int) Math.floor(Math.sqrt(number));

		for (int i = 3; i <= squareRootNumber; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main() {
		Scanner n = new Scanner(System.in);
		int value = n.nextInt();
		System.out.println(reverse(value));
	} 
}
