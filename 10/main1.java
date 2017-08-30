class main1
{
	public static void main(String args[])
	{
//		student1 ss = new student1();
//		student1[] s = {
		student_infac1[] s = {
			new A1("Ken",47),
			new A1("Jack",53),
			new A1("Mindy",76),
			new B1("Jeff",56),
			new B1("Gina",93),
			new B1("May",54),
			new C1("John",34),
			new C1("Marry",57),
			new C1("Felix",64),
		};

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].show());
		}
	/*
		s[0].chg(64);	// Ken

		System.out.println("------------------------");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].show());
		}
*/

	}
}

