class ex4
{
	public static void main(String args[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int Cha,Eng,Math;
		int Sum;
		
		System.out.print("國文:");
		Cha = sc.nextInt();
		System.out.print("英文:");
		Eng = sc.nextInt();
		System.out.print("數學:");
		Math = sc.nextInt();

		Sum = Cha + Eng + Math;

		System.out.println("==================");
		if(Sum>=200){
			System.out.println("第一階段:合格");

			System.out.println("==================");
			System.out.println("第二階段:"+(Math>=75?"合格":"不合格(數學未達75分)"));

		}else{
			System.out.println("第一階段:不合格(總分低於200分)");
		}
		
		



	
	}
}