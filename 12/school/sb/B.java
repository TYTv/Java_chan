package school.sb;
import school.stu.student;
import school.stu.student2;

public class B extends student implements student2
{
	private int eng;
	
	public B(String name, int eng)
	{
		super(name);
		this.eng=eng;
	}
	
	public String show()
	{
		return super.show()+"\tENG:"+eng;
		
	}


}

