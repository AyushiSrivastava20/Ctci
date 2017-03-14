package stringsquestions;

import java.util.Scanner;

public class CompressedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s = sc.nextLine();
		
		String str = compressed(s);
		System.out.println("final String : " +str);

	}

	private static String compressed(String s) {
		// TODO Auto-generated method stub
		
		if(s==null||s.length()==0)
			return null;
		
		StringBuilder compress = new StringBuilder();
		int count=0;
		
		for (int i=0;i<s.length();i++){
			
			count++;
			
			if(i+1>=s.length()|| s.charAt(i)!=s.charAt(i+1)){
				compress.append(s.charAt(i));
				compress.append(count);
				count=0;
			}
			
			
			
		}
		
		return compress.length()< s.length() ? compress.toString():s;
		
	}

}
