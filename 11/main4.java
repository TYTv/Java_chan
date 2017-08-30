interface student4
{
	double pi = 3.14;	// public final abstract
	void show();		// public final abstract
	void show2();		// public final abstract
}

/*
class SA implements student4
{
	
	public void show()
	{
		System.out.println("hello SA");
	}
	
}
*/

class main4
{
	public static void main(String args[])
	{
	//	student4 s = new student4();
		student4 s;
		s = new student4(){
			public void show()
			{
				System.out.println("hello SA");
			}
			public void show2()
			{
				System.out.println("hello2 any");
			}
		};
		s.show();
		s.show2();

	//	student4 ss;
	/*	ss = */new student4(){
			public void show()
			{
				System.out.println("hello SSAA");
			}
			public void show2()
			{
				System.out.println("hello2 aannyy");
			}
		}.show();
		


	/*
		SA sa = new SA();
		sa.show();
	*/
	}

}

