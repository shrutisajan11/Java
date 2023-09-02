import java.util.*;
class Demo 
{
	public static void main(String args[])
	{
		String str;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string of integers");
		str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str,",");
		while(st.hasMoreTokens())
		{
			String key=st.nextToken();
			int k;
			try
			{
				k=Integer.parseInt(key);
				sum=sum+k;
			}
			catch(NumberFormatException e)
			{
				System.out.println("The exception is:" +e);
			}
		}
		System.out.println("The sum of the numbers are:"+sum);
	}
}	