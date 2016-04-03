package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern8 {

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
		int noofspaces=x-1;
		for(i=1;i<=x;i++)
		{
			for(int k=1;k<=noofspaces;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
				System.out.print(" ");
			}		
			System.out.println();
			noofspaces--;
		}

	}

}
