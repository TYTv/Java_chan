class student2
{ 
	String name="student2 name";
	
	class A
	{
		String name="student2_A name";

		class a_1
		{
			String name="student2_A_a_1 name";

			void show()
			{
				System.out.println("hello student2.A.a_1--1");
			}
			void show2()
			{
				System.out.println("hello student2.A.a_1--2");
			}
			
		}
		
	}
	class B
	{
		String name="student2_B name";
	}


	void show()
	{
		System.out.println("hello student2--1");
	}
	
	void show2()
	{
		System.out.println("hello student2--2");
	}
	



}


class main2
{
	public static void main(String args[])
	{

		student2 s=new student2();
		System.out.println(s);
		System.out.println(s.name);

		student2.A sa = new student2().new A();
//		student2.A sa = s.new A();
		System.out.println(sa);	
		System.out.println(sa.name);	

		student2.A.a_1 sa1 = new student2().new A().new a_1();
		System.out.println(sa1); 
		System.out.println(sa1.name);

		sa1.show();
		sa1.show2();	
		new student2().new A().new a_1().show();


		student2.B sb = s.new B();
		System.out.println(sb); 
		System.out.println(sb.name);	


		System.out.println(s);//.show();
		System.out.println(s);//.show2();
		System.out.println(new student2());//.show();
		System.out.println(new student2());//.show2();

	}

}

