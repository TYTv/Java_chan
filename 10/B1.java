class B1 extends student1 implements student_infac1
{
	int eng;
	B1(String name,int eng)
	{
		super(name);

		this.eng = eng;


	}

	public String show()	// public for interface 
	{
		return( super.show()+"\tENG:"+eng );
	}

	public void sho()			// override
	{
		System.out.println("B - eng");
	}
	public void chg(int eng)	// override
	{
		this.eng = eng;
	}
	
}

