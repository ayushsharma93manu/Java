package Package1;

import java.util.Scanner;

public class String1 {
	
	public static void main(String[] args) {
		
		String str="AYUSH SHARMA";
		String c = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			 c = str.charAt(i)+"";
			
			 System.out.print(c.toLowerCase());
		}
		
	}
	
}
