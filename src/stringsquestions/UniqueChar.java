package stringsquestions;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.next();
		char a = firstUniqueChar(s);
		System.out.println(a);

	}

	private static char firstUniqueChar(String s) {
		// TODO Auto-generated method stub
		
		if(s==null && s.isEmpty()){
			
			System.out.println("string can not be null");
			return (Character) null;
		}
		int freq[] = new int[256];
		for(int i=00; i<s.length();i++){
			freq[s.charAt(i)-'a']++;
		}
		
		for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1 && s.charAt(i)!=' ')
                return s.charAt(i);
        return (Character) null;
		
	}

}
