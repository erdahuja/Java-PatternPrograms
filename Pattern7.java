package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size :");
		int x=Integer.parseInt(s.readLine());
		int i;
		for(i=1;i<=x;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
