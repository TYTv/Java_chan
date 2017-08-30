//import java.util.Scanner;
import java.util.*;

class add
{
	public static void main(String args[])
	{
		
//		Scanner sc = new Scanner(System.in);
		school s1 = new school("abc",5,78);
//		s1.change(1,2);
//		s1.show();
		System.out.println( s1.change1(1,2) + s1.change1(3,4) );
		s1.show();
		
		/*
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
		for(int n=0; n<32; n++){
			System.out.print((int)Math.pow(2,n)+",");
		}
		*/
	}
}

class school
{

	private String name;
	private int chi;
	private int eng;
	private int sum;
	private double ave;
	

	school(String name, int chi, int eng)
	{
		if(chi>=0 && chi<=100 && eng>=0 && eng<=100)
		{
			this.name = name;
			this.chi = chi;
			this.eng = eng;
			
			cal();
		}
		else
		{
			System.out.println("國英需介於0~100");
		}
		show();
	
	}
	
	school(String name)
	{
		this.name = name;
		show();
	}
	
	void change(int chi, int eng)
	{
		this.chi = chi;
		this.eng = eng;
		cal();
	}
	int change1(int chi, int eng)
	{
		this.chi = chi;
		this.eng = eng;
		
		return cal();
	}

	
	
	int cal(){
		sum = chi + eng;
		ave = sum / 2.;
		return sum;
	}

	void show()
	{

		System.out.println(
			"名:"+name+
			"\t國文:"+chi+
			"\t英文:"+eng+
			"\t總分:"+sum+
			"\t平均 :"+ave);

	}
	
}
