import java.util.*;
class Ex
{
	void numberformat(String s) throws NumberFormatException
	{	
		int d=Integer.parseInt(s);
	}
	void checkage(int age)
	{
	try{
		if(age<18)
		throw new ArithmeticException("Age below 18");
		}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	}
	void ArrayOutOfIndex()
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		try
		{
			arr[5]=6;
		}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("The Occurred Exception:"+e);
		}
		finally {
		System.out.println("The array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		System.out.println("");
		}
	}
}

class ExMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Ex obj=new Ex();
		System.out.println("Enter the age:");
		int a=sc.nextInt();
		obj.checkage(a);
		obj.ArrayOutOfIndex();
		System.out.println("Enter a string:");
		String s=sc.next();
		try
		{
			obj.numberformat(s);
		}
		catch(NumberFormatException e){
		System.out.println("The exception is:" +e);
		}
	}
}