class ex4
{
	public static void main(String args[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int Cha,Eng,Math;
		int Sum;
		
		System.out.print("���:");
		Cha = sc.nextInt();
		System.out.print("�^��:");
		Eng = sc.nextInt();
		System.out.print("�ƾ�:");
		Math = sc.nextInt();

		Sum = Cha + Eng + Math;

		System.out.println("==================");
		if(Sum>=200){
			System.out.println("�Ĥ@���q:�X��");

			System.out.println("==================");
			System.out.println("�ĤG���q:"+(Math>=75?"�X��":"���X��(�ƾǥ��F75��)"));

		}else{
			System.out.println("�Ĥ@���q:���X��(�`���C��200��)");
		}
		
		



	
	}
}