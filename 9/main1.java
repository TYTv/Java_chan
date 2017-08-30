class main1
{
	public static void main(String args[])
	{
/*
		A a = new A();
		A aa = new A();
		System.out.println( a );
		System.out.println( aa );
		aa = a;
		System.out.println( a );
		System.out.println( aa );
		System.out.println( a.equals(aa) );		// a == aa ?
		a.show();
*/
//		System.out.println( a instanceof student );
//		System.out.println( a instanceof A );
//		System.out.println( a instanceof A1 );

//		INIT init = new INIT("OTP");
//		System.out.println(init.name);
//		init.name = "MTP";
//		System.out.println(init.name);


		System.out.println(new B().sum(10,20,30));
		int d[] = {1,2,3};
//		System.out.println(new B().sum(d));
		System.out.println(new B().sum(d));
		System.out.println(new B().sum(1,2,3));

	}
}

class student
//class student extends Thread
//class student extends Math
//final class student	// can't inherit
{
//			double pi = 3.1415;
	final	double pi = 3.1415;	// can't overrid

}

//class A
class A extends student
{
	final void show()
	{
		//pi=1.2;
		System.out.println("pi="+pi);
	}
}
class A1 extends A
{
	void show1()
	{

	}
}

//class B
class B extends student
{
	int sum(int d0, int d1, int d2){
		return (d0+d1+d2);
	}
//	int sum(int d[]){
//		return (d[0]+d[1]+d[2]);
//	}
	int sum(int... d){
		return (d[0]+d[1]+d[2]);
	}
	void ad(int[] a,int[] aa){
	}

	void ada(int aa,int aaa,int... a){
//	void ada(int... a,int aa,int aaa){
	}

//	void ada(int... a,int... aa){
//		return a[0]+aa[0];
//	}
}

class INIT
{
//	final String name;	// One time programming
	String name;

	INIT(String name)
	{
		this.name = name;
	}
}

