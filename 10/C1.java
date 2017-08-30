class C1 extends student1 implements student_infac1
{
	int math;
	C1(String name,int math)
	{
		super(name);

		this.math = math;


	}

	public String show()	// public for interface 
	{
		return( super.show()+"\tMATH:"+math );
	}

	public void sho()				// override
	{
		System.out.println("C - math");
	}
	public void chg(int math)		// override
	{
		this.math = math;
	}
	
}

