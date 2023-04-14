package practice;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="pavankumarpavan";
		String sub ="pavan";
		int idx=0,count=0,pos =0;
		while((idx =s.indexOf(sub, pos))!=-1)
		{
			count++;
			pos =idx+sub.length();
			System.out.println(pos);
			
			}
		
		System.out.println(count);
		}	
	
	


}
