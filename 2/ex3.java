class ex3
{
	public static void main(String args[])
	{

/*
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("�п�J�@�ӼƦr");
		
		int x;
		
		x = sc.nextInt();
		
		System.out.println("�A��J���O:"+x);
*/
/*
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("�п�J�ت��ƶq");
		int x;
		x = sc.nextInt();

		System.out.println("�п�J�����ƶq");
		int y;
		y = sc.nextInt();

		System.out.println("�@�@:"+(x*25+y*39)+"��");
*/	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();
		if( x > 100 )
		{
			System.out.println("Data over range !");
		}			
		else if( x >= 91 )
		{
			System.out.println("Rank A");
		}
		else if( x >= 76 )
		{
			if( x >= 82 )
			{
				System.out.println("Rank B+");
			}
			else
			{
				System.out.println("Rank B-");
			}
		}
		else if( x >= 60 )
		{
			System.out.println("Rank C");
		}
		else if( x >= 0 )
		{
			System.out.println("Rank D");
		}
		else
		{
			System.out.println("Data under range !");
		}
	}



}