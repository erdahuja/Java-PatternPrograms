package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size :");
		int x=Integer.parseInt(s.readLine());
		for(int i=0;i<x;i++)
			{
				for(int j=0;j<x;j++)
				{
					if(j<=i)
					System.out.print("*");
					
				}
				System.out.println();
				
			}
		
		
		// TODO Auto-generated method stub

	}

}
