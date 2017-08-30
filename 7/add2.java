
class add2
{
	public static void main(String args[])
	{

		A a1 = new A();
		B b1 = new B();

		a1.show();
		b1.show();
	
	}
}

class A	extends school
{
	int excel;

	A(){
		System.out.println("AAAAA");
	}
	
	void show(){
		System.out.println("名:"+name+"\t國文:"+chi+"\texcel:"+excel);
	}
}

class B extends school
{
	int word;

	B(){
		System.out.println("BBBBB");
	}

	void show(){
		System.out.println("名:"+name+"\t國文:"+chi+"\tword:"+word);
	}
}

class school
{
	String name;
	int chi;
	
	school(){
		System.out.println("HELLO");
	}
}
