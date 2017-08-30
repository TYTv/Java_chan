class student3
{
	static String name="student3";
	static void show()
	{
		System.out.println("hello student3--1");
	}
	
	void show2()
	{
		System.out.println("hello student3--2");
	}
	
	static class A
	{
		
		void show2()
		{
			System.out.println("hello student3.A-2");
		}
		static void show()
		{
			System.out.println("hello student3.A--1");
		}
	}


}

class main3
{
	public static void main(String args[])
	{

		student3.show();
		new student3().show2();

		student3.A sA = new student3.A();
		System.out.println(sA);
		sA.show2();
		student3.A.show();
		
		//System.out.println(student3.name);
	}
}

