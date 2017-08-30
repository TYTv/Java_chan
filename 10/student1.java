/*abstract*/ class student1
{
	String name;
	student1(String name)
	{
		this.name = name;
	}

	String show()
	{
		return("NAME="+name);
	}
//	abstract void sho();			// for override
//	abstract void chg(int chi);		// for override

}

interface student_infac1
{
	String show();		//	public abstract
	void sho();			//	public abstract	
	void chg(int x);	//	public abstract
}


