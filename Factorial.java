package com.nit;

public class Factorial {
	
	int calculateFactorial(int num)
	{
		int i,a=1;
		
		for(i=num;i>=1;i--)
		{
			a=a*i;
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial obj=new Factorial();
		System.out.println(obj.calculateFactorial(6));

	}

}
