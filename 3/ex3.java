class ex3
{
	public static void main(String args[])
	{
		int Price_x = 29;
		int Price_y = 39;
		int Price_z = 49;
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("尺("+Price_x+"$)\t\t數量:");
		int Good_x = Price_x * sc.nextInt();

		System.out.print("筆("+Price_y+"$)\t\t數量:");
		int Good_y = Price_y * sc.nextInt();

		System.out.print("圓規("+Price_z+"$)\t數量:");
		int Good_z = Price_z * sc.nextInt();

		System.out.println("============================");

		int Sum = Good_x + Good_y + Good_z ;
		System.out.println("應付總價:"+Sum+"\n");

		System.out.print("現金支付:");
		int Pay = sc.nextInt();
		System.out.println();
		
		int Rtn = Pay - Sum;
		int Rtn100 = Rtn/100;
		int Rtn10 = (Rtn%100)/10;
		int Rtn1 = (Rtn%100)%10;
		System.out.println("現金找零:"+Rtn);
		System.out.println("(百元:"+Rtn100+"張)");
		System.out.println("(十元:"+Rtn10+"枚)");
		System.out.println("(一元:"+Rtn1+"枚)");

	}
}