package practice;

public class PrimeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int flag = 0,i,j;
		for(j=2;j<=100;j++)
		{	
			for( i=2;i<j;i++)
		{
			if(j%i==0)
			{
				flag=1;
				break;
			}
			else
				flag=0;
		}
			if(flag==0)
				System.out.println(j);
		}
		
	}

}
