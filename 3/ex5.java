class ex5
{
	public static void main(String args[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int sum = 0;
		int n = sc.nextInt();
		for(int x=1; x<=n; x++)
		{
			sum += x;
			System.out.println("x="+x+"\tsum="+sum);
		}
	
	
	}
	
}