package school.sa;
import school.stu.student;
import school.stu.student2;

public class A extends student implements student2
{
	private int chi;
	
	public A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}
	
	public String show()
	{
		//return super.show()+"\tCHI"+chi;
		return show2()+"\tCCHHII"+chi;
	}
	
}


