class ex3
{
	public static void main(String args[])
	{
		int Price_x = 29;
		int Price_y = 39;
		int Price_z = 49;
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("��("+Price_x+"$)\t\t�ƶq:");
		int Good_x = Price_x * sc.nextInt();

		System.out.print("��("+Price_y+"$)\t\t�ƶq:");
		int Good_y = Price_y * sc.nextInt();

		System.out.print("��W("+Price_z+"$)\t�ƶq:");
		int Good_z = Price_z * sc.nextInt();

		System.out.println("============================");

		int Sum = Good_x + Good_y + Good_z ;
		System.out.println("���I�`��:"+Sum+"\n");

		System.out.print("�{����I:");
		int Pay = sc.nextInt();
		System.out.println();
		
		int Rtn = Pay - Sum;
		int Rtn100 = Rtn/100;
		int Rtn10 = (Rtn%100)/10;
		int Rtn1 = (Rtn%100)%10;
		System.out.println("�{����s:"+Rtn);
		System.out.println("(�ʤ�:"+Rtn100+"�i)");
		System.out.println("(�Q��:"+Rtn10+"�T)");
		System.out.println("(�@��:"+Rtn1+"�T)");

	}
}