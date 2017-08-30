class student
{
	String	name = "______";
	private int	chi = -1;
	private int	eng = -1;
	private int	sum = -1;
	private double ave = -1;

	student( int chi, int eng ){
		
		if(chi>=0&&chi<=100&&eng>=0&&eng<=100){
			this.chi = chi;
			this.eng = eng;
			System.out.println("新增一位學員");
		}else{
			System.out.println("僅允許0~100");
		}
	}

	void datain(){
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("國文成績:");
		chi = sc.nextInt();
		System.out.print("英文成績:");
		eng = sc.nextInt();
		
	}

	void cal(){
		sum = chi + eng;
		ave = sum;
		ave /= 2; 
	}

	void show(){
		cal();
		System.out.println(
			"姓名:"+name+
			"\t國文:"+chi+
			"\t英文:"+eng+
			"\t總分:"+sum+
			"\t平均:"+ave
		);
	
	}
	
}



class add
{
	public static void main(String args[])
	{

		student s1 = new student(12,34);
		student s2 = new student(56,78);
	
		s1.show();
		s2.show();

		s1.datain();
		s2.datain();

		s1.show();
		s2.show();
	
	}



}

