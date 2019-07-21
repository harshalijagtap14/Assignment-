package com.nit;

public class MarkValidator1 {
	
	String isPass(int m)
	{
		if(m>=40)
			return "true";
		else 
			return "false";
	}
	
	String markGrade(int m)
	{
		switch(m)
		{
			
			case 91: return "A";
			case 90:
			case 76:
				return "B";
			case 75:
			case 61:
				return "C";
			case 40:
				return isPass(m);
		    default:
		    	return "D";
		}
	}
	
	
	
	public static void main(String args[])
	{
		MarkValidator obj=new MarkValidator();
		System.out.print(obj.markGrade(56));
	}

}
