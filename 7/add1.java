
import static java.lang.Math.*;
import java.util.Scanner;

class add1
{

	public static void main(String args[])
	{
		
		System.out.println( CAL.FV(1394,0.34,4) );
		System.out.println( CAL.AR(0.344) );
		System.out.println( CAL.RO(4) );
		
		
		Scanner sc = new Scanner(System.in);
		int n,money;
		
		
		System.out.print("輸入筆數:");
		n=sc.nextInt();
		System.out.print("輸入本金:");
		money=sc.nextInt();
		
		FV[] f=new FV[n];
		FV.money=money;
		for(int i=0;i<f.length;i++)
		{
			System.out.print("輸入第"+(i+1)+"筆-->利率: ");
			double r=sc.nextDouble();
			System.out.print("輸入第"+(i+1)+"筆-->年: ");
			int y=sc.nextInt();
			
			f[i]=new FV(r,y);
			
			
			
		}
		FV.title();
		for(int i=0;i<f.length;i++)
		{
			f[i].show();
		}
		
		/*
		FV.money = 84321;

		FV fv1 = new FV(0.03,5);
		FV fv2 = new FV(0.08,3);
		FV fv3 = new FV(0.05,4);
		FV.title();
		fv1.show();
		fv2.show();
		fv3.show();

		fv1.money = 99999;
		fv1.show();
		fv2.show();
		fv3.show();
		*/
	}

}

class FV
{
	private static int n;
	private int number;
	static int money;
	private double r;
	private int y;
	private double fv;

	FV(/*int number,int money,*/double r,int y)
	{
		this.number = ++n;
	//	this.money = money;
		this.r = r;
		this.y = y;
	}

	void show()
	{
		
		fv = money * pow( (1+r), y );
		System.out.println(number+"\t"+money+"\t"+r+"\t"+y+"\t"+fv);
		
	//	System.out.println("人數="+n+"個");
	}
	
	static void title()
	{
		System.out.println("編號\t本金\t利率\t年\t複利本利和");		
	}

}

class CAL
{
	static double FV(int money,double r, int y)
	{
		return money*Math.pow((1+r),y);
	}
	
	static double AR(double r)
	{
		return 3.14*r*r;
	}
	
	static double RO(double r)
	{
		return 2*3.14*r;
	}
}