package stringsquestions;


import java.util.*;
import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string s1");
		String s1= sc.nextLine();
		System.out.println("enter string s1");
		String s2= sc.nextLine();
		CheckPermutation cp = new CheckPermutation();
		boolean flag = cp.permutation(s1, s2);
		if (flag== true)
			System.out.println("same");
		else
			System.out.println(" not same same");
			
	}
	
	public boolean permutation(String s1, String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		char[] sa1 = s1.toCharArray();
		Arrays.sort(sa1);
		s1=new String(sa1);
		char[] sa2 = s2.toCharArray();
		Arrays.sort(sa2);
		s2 = new String(sa2);
		
		if(s1.equals(s2))
			return true;
		
		else 
			return false;

		
	}

}
