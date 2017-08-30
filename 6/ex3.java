class ex3
{
	public static void main(String args[])
	{
		int x=10;
		int y=20;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println("====================");
		y=x;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		y=30;
		System.out.println("x="+x);
		System.out.println("y="+y);

		int[] x1 = {1,2,3};
		int[] y1 = {4,5,6};
		System.out.println(x1+",\t"+x1[0]+",\t"+x1[1]+",\t"+x1[2]);
		System.out.println(y1+",\t"+y1[0]+",\t"+y1[1]+",\t"+y1[2]);
		
		x1[0] = y1[0];
		x1[0] = 99;
		System.out.println(x1+",\t"+x1[0]+",\t"+x1[1]+",\t"+x1[2]);
		System.out.println(y1+",\t"+y1[0]+",\t"+y1[1]+",\t"+y1[2]);

		x1 = y1;
		x1[0] = 99;

		System.out.println(x1+",\t"+x1[0]+",\t"+x1[1]+",\t"+x1[2]);
		System.out.println(y1+",\t"+y1[0]+",\t"+y1[1]+",\t"+y1[2]);

		y1 = null;		
		System.out.println(x1);
		System.out.println(y1);

		
	}
	
}