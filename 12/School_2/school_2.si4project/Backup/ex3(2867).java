import java.io.File;
import java.io.IOException;
class ex3
{
	public static void main(String args[]) throws IOException
	{
//		try
		{
			File f = new File("c:/abc.txt");
			
			f.createNewFile();		// new java.io.IOException();
		}
//		catch(IOException e)
		{
//			System.out.println("Create file error!");
		}
	}

}

class student
{

}

