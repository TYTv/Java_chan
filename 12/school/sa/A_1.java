package school.sa;
import school.stu.student2;

public class A_1 extends A implements student2
{
	private int math;
	
	public A_1(String name, int chi, int math)
	{
		super(name,chi);
		this.math=math;
		
		
	}
	
	public String show()
	{
		
		return super.show()+"\tMATH:"+math;
	}



}

