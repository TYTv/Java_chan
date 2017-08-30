class student1
{
	String name;
	static String schoolName;
	
	
	student1(String name)
	{
		this.name=name;
	}
	
	void show()
	{
		System.out.println("name:"+name+"\tschoolname:"+schoolName);
		
	}
	String show2()
	{
		System.out.println("name:"+name+"\tschoolname:"+schoolName);
		return "name:"+name+"\tschoolname:"+schoolName;
		
	}
	static void title()
	{
		System.out.println("NAME\tSCHOOLNAME");
		System.out.println("---------------------------");
	}

}


class main1
{
	public static void main(String args[])
	{
		student1.schoolName="GJcomputer";
		student1.title();
		
		student1[] s=
		{
			new student1("aa"),
			new student1("oo")
		};
			
			
		for(int i=0;i<s.length;i++)
		{
//			s[i].show();
			System.out.println(s[i].show2()+"\taaaaaaa");
		}
		System.out.println("---------------------------");
		s[0].schoolName="GJUN";
		for(int i=0;i<s.length;i++)
		{
			s[i].show();
		}
	}


}

