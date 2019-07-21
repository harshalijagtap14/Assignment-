package com.nit;

public class MarkValidator {
	
	String isPass(int m) {
		
		if(m>=40)
			return "true";
		else
			return "false";
		
	}
	
	String markGrade(int m)
	{
		if(m<=40)
			return isPass(m);
		else if(m>90)
			return "A";
		else if(m>75&&m<=90)
			return "B";
		else if(m>60&&m<=75)
			return "C";
		else
			return "D";
		
	}
	
	public static void main(String args[])
	{
		MarkValidator obj=new MarkValidator();
		System.out.print(obj.markGrade(95));
		
	}

}
