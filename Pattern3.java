package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern3 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size :");
		int x=Integer.parseInt(s.readLine());
		int j,i;
		for(i=0;i<=x;i++)
			{
				for(j=0;j<x-i;j++)
				{
					System.out.print(" ");					
				}
				
				for(int k=x;k>x-i;k--)
				System.out.print("*");
				System.out.println();
		
	}
		}
	

}
