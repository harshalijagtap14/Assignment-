package com.nit;

public class Temperature {
	
	int convertToFarenheit(int T)
	{
		int T1;
		T1= (9*T)/5 + 32;
		return T1;
	}
	
	int convertToCelsius(int T)
	{
		int T2;
		T2= ((T-32)*5)/9;
		return T2;
    }
	
	public static void main(String args[])
	{
		Temperature obj=new Temperature();
		System.out.println(obj.convertToFarenheit(45));
		System.out.println(obj.convertToCelsius(113));
	}

}
