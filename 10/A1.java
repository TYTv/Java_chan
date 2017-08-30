class A1 extends student1 implements student_infac1
{
	int chi;
	A1(String name, int chi)
	{
		super(name);

		this.chi = chi;


	}

	public String show()	// public for interface 
	{
		return( super.show()+"\tCHI:"+chi );
	}
	public void sho()			// override
	{
		System.out.println("A - chi");
	}
	public void chg(int chi)	// override
	{
		this.chi = chi;
	}
	
}

