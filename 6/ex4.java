class ex4
{
	public static void main(String args[])
	{
		int[] x={10,20,30,52};
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println(x[3]);
		System.out.println(x);
		x = new int[10];
		
		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}


}