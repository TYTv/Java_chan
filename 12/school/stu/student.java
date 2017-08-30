package school.stu;

public class student
{
	private String name;
	
	public student(String name)
	{
		this.name=name;
	}
	
	
	public String show()
	{
		return "NAME:"+name;
	}
	
	protected String show2()
	{
		return "NNAAMMEE:"+name;
	}


}

