package com.IfElseDemo;

public class IfElseDemo_BiggestNum 
{

	public static void main(String []args)
	{
		int a=80;
		int b=35;
		int c=20;
		int d=75;

		int biggestNum=a;//First Assume a is Biggest and a is assigned with biggestNum

		if(biggestNum<b)
		
			biggestNum=a;
		
		if(biggestNum<c)
		
			biggestNum=c;
		
        if(biggestNum<d)
		
			biggestNum=d;
		System.out.println("The Biggest Number Of Four Numbers:"+biggestNum);
		
	}
}
