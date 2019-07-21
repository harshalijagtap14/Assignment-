package com.nit;

public class SumOfNumbers {
	
	int SumOfEven(int s,int e)
	{
		int i,s1=0;
		if(s%2==0)
		{
			for(i=s;i<=e;i=i+2)
			{
				s1=s1+i;
			}
		}
		
		else {
			
			for(i=s+1;i<=e;i=i+2)
			{
				s1=s1+i;
			}
		}
		
		return s1;

}
	
	int SumOfOdd(int s,int e)
	{
		int i,s2=0;
		if(s%2!=0)
		{
			for(i=s;i<=e;i=i+2)
			{
				s2=s2+i;
			}
		}
			
			else {
				
				for(i=s+1;i<=e;i=i+2)
				{
					s2=s2+i;
				}
			}
		
			
			return s2;
		
	}
	
	public static void main(String args[])
	{
		SumOfNumbers obj=new SumOfNumbers();
		System.out.println("Sum of even numbers: "+obj.SumOfEven(5,15));
		System.out.println("Sum of odd numbers: "+obj.SumOfOdd(5,15));
	}
}
