package StackQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "{[()]}";
		if(validatebrackets(s)){
			System.out.println("valid");
			
		}
		else{
			System.out.println("Not valid");
		}

	}

	public static boolean validatebrackets(String s) {
		// TODO Auto-generated method stub
	Map<Character,Character> brac = new HashMap<Character, Character>(){
		{
			put('(', ')');
            put('[', ']');
            put('{', '}');
		}
	};
	
	if(s.length() % 2 !=0){
		return false;
	}
	
	Stack<Character> bracstack = new Stack<>();
	for(int i=0;i<s.length();i++){
		if(brac.containsKey(s.charAt(i))){
			bracstack.push(s.charAt(i));
		}
		
		else if(bracstack.isEmpty()|| brac.get(bracstack.pop()) !=s.charAt(i)){
			return false;
		}
	}
		return true;
	}

}
