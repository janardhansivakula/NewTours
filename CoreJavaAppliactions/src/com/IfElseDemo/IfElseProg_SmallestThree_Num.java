package com.IfElseDemo;

public class IfElseProg_SmallestThree_Num 
{
	public static void main(String[]args)
	{
		int a=10;//third Least
		int b=20;//second least
		int c=30;//First least
		
		int small=a;
		
		if(small>b) 
		{
			small=b;
			}
		if(small>c)
			{
			small=c;
			}
		
		System.out.println("Least Num Of Three Numbers:"+small);
		
		
			
        
	}
}
