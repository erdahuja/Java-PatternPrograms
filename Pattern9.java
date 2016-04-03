package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern9 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size :");
		int x=Integer.parseInt(s.readLine());
		int i;
		int noofspaces=x-1;
		int odd=1;
		
		for(i=1;i<=x;i++)
		{int n=2;
			for(int k=1;k<=noofspaces;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=odd;j++)
			{
				if(j<=i)
				{																		/* int k=0;
																							*if(j<=i){
																							*k=k+1;
																							*}
																							*else
																							*{
																							*k=k-1;
																							*}
																							*syso(k);
																							*/
					System.out.print(j);																	
				}
				else if(j>i)
				{	
					System.out.print(j-n);
					n=n+2;
				}
			}
				
			System.out.println();
			noofspaces--;
			odd=odd+2;
		}
	}

}
