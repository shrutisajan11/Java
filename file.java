import java.io.*;
class Files
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream f1=null;
		FileOutputStream f2=null;
		try
		{
			f1=new FileInputStream("test.txt");
			f2=new FileOutputStream("next.txt");
			int c;
			do
			{
				c=f1.read();
				if(c!=-1)
				{
					System.out.println((char)c);
					f2.write(c);
				}
			}while(c!=-1);
		}
		finally
		{
			f1.close();
			f2.close();
		}
	}
}