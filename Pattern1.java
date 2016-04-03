package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Pattern1 {

	
	public static void main(String[] args) throws IOException {
		
		String s1="hello,";
		System.out.println("enter your name :");
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		String name=s.readLine();
		String s2=s1+name+"!";
		int x=s2.length();
		
			for(int i=0;i<=x;i++)
			System.out.print("*");
		
		System.out.print("\n");
		System.out.print("*");
		System.out.print(s2);
		System.out.println("*");
		
			for(int i=0;i<=x;i++)
			System.out.print("*");
		
		

	}

}
