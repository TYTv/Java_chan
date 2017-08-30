class ex4
{
	public static void main(String args[])
	{

		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println( sc.nextInt()>=60 ? "OK" : "NG");
	
		System.out.println("Please input A~D");
		int x = sc.nextInt();
		switch(x)
		{
			case 'A':
				System.out.println("VIP");
				break;
			case 'B':
				System.out.println("ª÷");
				break;
			case 'C':
				System.out.println("»È");
				break;
			case 'D':
				System.out.println("´¶");
				break;
			default:
				System.out.println("Input error !");
				break;
			
		}
	
	
	
	}
}