package stringsquestions;

import java.util.Scanner;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence : ");
		String inputString = sc.nextLine();
		if (isPermPalindrome(inputString))
			System.out.println("String is permutation of a palindrome");
		else
			System.out.println("String is NOT a permutation of a palindrome");
		sc.close();
	}
	
	public static boolean isPermPalindrome(String inputString) {
		char input[] = inputString.toLowerCase().replace(" ", "").toCharArray();

		// Assuming 128 chars of ASCII
		int charCounts[] = new int[128];

		// Count characters occurences
		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ') {
				int number = input[i];
				charCounts[number]++;
			}
		}

		int numberOdds = 0;
		
		//Check number of odd occurences of characters is atmost 1 for odd length string
		//Check number of odd occurences of characters is 0 for even length string 
		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] % 2 != 0) {
				if (input.length % 2 == 0)
					return false;
				else if (input.length % 2 != 0 && numberOdds >= 1)
					return false;
				numberOdds++;
			}
		}

		return true;
	}

}
