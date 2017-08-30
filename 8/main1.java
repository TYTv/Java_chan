class main1
{
	public static void main(String args[])
	{
	
		school sch = new school("Jack");
//		sch.show();
//		sch.show("Hellen");
//		sch.show(47);	/*NG*/

		A a = new A("Amber",63,95);
		System.out.println(a.abc(100));
//		a.show();
//		a.show("Bob");
//		a.show("94");
//		A aa = new A("Amber",54);
//		aa.show();

//		A_1 a1 = new A_1("Jeson",55,11);
//		a1.show();
//		a1.show("Andy");

//		B b = new B("MissQ",47);
//		b.show();

	}

}



class school
{
	String name;
	int chi;

	school( String name, int chi ){
		System.out.println("SCOOL新增一位學員:"+name+"\t國文"+chi);
		this.name = name;
		this.chi = chi;
	}
	school( String name ){
		System.out.println("SCOOL新增一位學員:"+name+"\t國文"+chi);
		this.name = name;
		this.chi = chi;
	}

	void show(){
		System.out.println("========SCOOL_SHOW========");
	}
	void show(String name)
	{
		this.name = name;
		System.out.println("========SCOOL_SHOW========學生"+name);
	}

	public int abc(int x){
//	protected int abc(int x){
//	int abc(int x){
//	private int abc(int x){
		return x;
	}
}

class A extends school
{
	private int word;

	A( String name, int chi, int word ){
		super( name, chi );		/* class school( String, int ) */
		
		this.word = word;
		System.out.println("A班學生\t"+"WORD"+word);

	}
	A( String name, int word ){
		super( name );			/* class school( String ) */
		
		this.word = word;
		System.out.println("A班學生\t"+"WORD"+word);

	}
	void show()
	{
		System.out.println("========A_SHOW========");
	}
	void show( int word )
	{
		this.word = word;
		System.out.println("========A_SHOW========A班"+word);
	}

	public int abc(int x){
//	protected int abc(int x){
//	int abc(int x){
//	private int abc(int x){
		return super.abc(x)+40;
	}

}

class A_1 extends A
{
	int access;
	
	A_1( String name, int word, int excel ){
		super( name, word );		/* class school( String ) */
		
		this.access = access;
		System.out.println("A-1組學生\t"+"ACCESS"+access);
		System.out.println("---"+name+"---");

	}

}

class B extends school
{
	int excel;

	B( String name, int excel ){
		super( name );		/* class school( String ) */
		
		this.excel = excel;
		System.out.println("B班學生\t"+"EXCEL"+excel);

	}

}



