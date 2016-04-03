package practice;

public class Palindrome {

	public static void main(String[] args) {
		String s="mom";
		String s1="hello";
		StringBuffer b=new StringBuffer(s);
b.reverse();
System.out.println(b);
if(s1.equals(b.toString()))
{
	System.out.println("same");
}
	}

}
