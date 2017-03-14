package stringsquestions;

import java.util.Scanner;

public class Urlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] str = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' '};
		
		Urlify u1 = new Urlify();
		
		u1.replacestr(str, 13);
		

	}
	
	public void replacestr(char[] str, int length){
		
		int count=0, newlength=0;
		
		for(int i=0; i<length;i++){
			
			if(str[i]==' '){
				count++;
			}
		}
		
		
		newlength=length+ (count*2);
		
		str[newlength]='\0';
		for(int i=length-1;i>=0;i--){
			if(str[i]==' '){
				
				str[newlength-1]='0';
				str[newlength-2]='2';
				str[newlength-3]='%';
				newlength=newlength-3;
				
			}
			
			else{
				str[newlength-1]=str[i];
				newlength=newlength-1;
			}
		}
		
		String resultString = new String(str);
		
		System.out.println("Take a sentece"+ resultString);
	}
	
	

}
