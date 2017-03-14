package stringsquestions;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String string1 = sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String string2 = sc.nextLine();

		if (isRotatedSub(string1, string2))
			System.out.println("Is Rotated Substring");
		else
			System.out.println("Is NOT Rotated Substring");
		sc.close();
	}

	private static boolean isRotatedSub(String string1, String string2) {
		// TODO Auto-generated method stub
		
		if(string1.length()!=string2.length()){
			return false;
			
		}
		
		String merged = string1 + string2;
		return merged.contains(string2);
		
	}
	
	

}
