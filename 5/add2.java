import java.util.Scanner;

class add2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Payroll p1 = new Payroll(sc.next(),sc.nextInt());
//		p1.Show();

	}
	
}

class Payroll
{
	private String	name;
	private int		proformance;
	private double	bonusratio;
	private int		bonus;
	private int		basicpay = 18000;
	private int		actualpay;

	Payroll(String name, int proformance){

		this.name = name;
		this.proformance = proformance;
		
		if( this.proformance < 0 ){
			System.out.println("error!");
			return;
		}else if( this.proformance <= 500000 ){
			this.bonusratio = 0;
		}else if( this.proformance <= 1000000 ){
			this.bonusratio = 0.03;
		}else if( this.proformance <= 1500000 ){
			this.bonusratio = 0.05;
		}else{
			this.bonusratio = 0.07;
		}

		this.bonus = (int)(this.proformance * this.bonusratio);
		this.actualpay = this.basicpay + this.bonus;
		Show();
	
	}
	void Show()
	{
		System.out.println
		(
		"[姓名]"	+name+
		",[業績]"	+proformance+
		",[獎金比]"	+bonusratio+
		",[獎金]"	+bonus+
		",[底薪]"	+basicpay+
		",[實領]"	+actualpay
		);
	}
	
	
	
}
