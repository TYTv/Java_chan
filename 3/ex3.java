class ex3
{
	public static void main(String args[])
	{
		int Price_x = 29;
		int Price_y = 39;
		int Price_z = 49;
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("へ("+Price_x+"$)\t\t计秖:");
		int Good_x = Price_x * sc.nextInt();

		System.out.print("掸("+Price_y+"$)\t\t计秖:");
		int Good_y = Price_y * sc.nextInt();

		System.out.print("蛾砏("+Price_z+"$)\t计秖:");
		int Good_z = Price_z * sc.nextInt();

		System.out.println("============================");

		int Sum = Good_x + Good_y + Good_z ;
		System.out.println("莱羆基:"+Sum+"\n");

		System.out.print("瞷や:");
		int Pay = sc.nextInt();
		System.out.println();
		
		int Rtn = Pay - Sum;
		int Rtn100 = Rtn/100;
		int Rtn10 = (Rtn%100)/10;
		int Rtn1 = (Rtn%100)%10;
		System.out.println("瞷т箂:"+Rtn);
		System.out.println("(κじ:"+Rtn100+"眎)");
		System.out.println("(じ:"+Rtn10+"猅)");
		System.out.println("(じ:"+Rtn1+"猅)");

	}
}