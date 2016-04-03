package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern6 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter odd no. size :");
		int x=Integer.parseInt(s.readLine());
		int i;
		int odd=1;
		int number_of_spaces=x/2;
		for(i=1;i<=x;i++)
		{
			for(int k=number_of_spaces;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=odd;j++)
			{
			System.out.print("*");
			}
			System.out.println();
			
			if(i<x/2+1)
		{odd=odd+2;
			number_of_spaces=number_of_spaces-1;
		}else
				{
			
			odd=odd-2;
			number_of_spaces=number_of_spaces+1;	}
		}


	}

}
