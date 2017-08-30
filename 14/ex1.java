import java.util.Scanner;

class ex1
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);

			System.out.print("n=");
			int n=sc.nextInt();						// new java.util.InputMismatchException();
			int[] x = new int[3];
			
			System.out.println("10/n="+(10/n));		// new ArithmeticException();
			for(int i=0;i<=n;i++)
			{
			
				System.out.println("i=" + i + "\thello");
				x[n] = 100;							// new java.lang.ArrayIndexOutOfBoundsException();
			
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
		catch(java.lang.ArrayIndexOutOfBoundsException b)
		{
			System.out.println(" Array index range not correct !! (n-1)");
		}
		
	}


}

