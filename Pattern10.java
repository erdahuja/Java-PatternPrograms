package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern10 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size :");
		int x=Integer.parseInt(s.readLine());
		int i;
		int noofspaces=x/2;//x=7,3; 5,2
		
		int odd=1;
		int p=0;
		for(i=1;i<=x;i++)
		{
			for(int k=1;k<=noofspaces;k++)
				System.out.print(" ");
			
			
if(i<x/2+1)
{
	p=i;noofspaces=noofspaces-1;
}
else
{
	p=x+1-i;
	noofspaces=noofspaces+1;
}
			for(int j=1;j<=odd;j++)
			{
				int middleColum=odd/2+1;
				System.out.print(p);
				if(j<middleColum)
				{
					p--;
				}
				else
				{				
					p++;
				}	
			}	
			
			System.out.println();
			if(i<x/2+1)
			{
				odd=odd+2;
			}
			else
			{
				odd=odd-2;
			}
		}
	}

}
