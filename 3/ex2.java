class ex2
{
	public static void main(String args[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		a:
		for(int x=1;x<=n;x++){
			b:
			for(int y=1; y<=m ;y++){
				
				if(y==3){break a;}
				System.out.print(x+"*"+y+"="+(x*y)+'\t');
			}
			System.out.print('\n');
		}
	
	
	
	}
	
}