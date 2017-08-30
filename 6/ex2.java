class ex2
{
	public static void main(String args[])
	{
		/*int[] chi = new int[3];
		int[] eng = new int[3];*/
		
//		int[][] grade = new int[2][3];
//		int grade[][] = {{2,3,64,3},{8,3,78}};
		int[][] grade = {{2,3,64,3,3,0,5},{8,3,78,234}};
		System.out.println(grade);
		System.out.println(grade[0]);
		System.out.println(grade[0].length);
		System.out.println(grade[1].length);

		for(int x=0; x<grade.length; x++)
		{
			for(int y=0;y<grade[x].length;y++)
			{
				System.out.println("grade["+x+"]["+y+"]="+grade[x][y]);
				
			}
		}

	}
	
}