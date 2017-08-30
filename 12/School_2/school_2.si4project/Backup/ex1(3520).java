import java.util.Scanner;

class ex1
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			
			System.out.println("10/n="+(10/n));
			for(int i=0;i<=10;i++)
			{
				System.out.println("i=" + i + "\thello");
				
			
			}
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Please input integer !!");
		}
		catch(ArithmeticException a)
		{
			System.out.println(" Divide not allow by zero !!");
		}

		
	}


}

