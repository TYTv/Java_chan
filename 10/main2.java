interface TEXT		// interface=abstract, all variables=consts
{
	//public final double pi = 3.14;
	double pi = 3.14;						// auto add "public final" =const

	/*public abstract*/ void abc();			/* auto add "public abstract" */
	void abc(int x);						/* auto add "public abstract" */
}


class text implements TEXT		// extends->implements
{
	public void abc()		// override, need >= public level
	{
		;
	}

	public void abc(int y)	// override, need >= public level
	{
		;
	}
	
}


/*
class main2
{
	public static void main(String args[])
	{
		text t = new text();
		
//		text t = new text();
//		System.out.println(t.pi);
	
	}


}
*/

