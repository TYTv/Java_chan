class main2
{
	public static void main(String args[])
	{

		student[] ARR = {
			new A(),
			new B(),
			new C(),
			new A(),
			new B(),
			new C(),
			new A1(),
		};

		for( int i=0; i<ARR.length; i++ ){
		//	ARR[i].show();
		//	ARR[i].aaa();
		//	ARR[i].bbb();
		}

ARR[0].show();
ARR[1].show();
ARR[2].show();



/*
		student stu = new student();
		student a = new A();
		student b = new B();
		student c = new C();

//		stu.show();
		a.show();
		a.aaa();
		b.show();
		b.bbb();
//		c.show();

		System.out.println(stu);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
*/

/*
		student stu = new student();
		A a = new A();
		B b = new B();
		C c = new C();

		stu.show();
		a.show();
		a.aaa();
		b.show();
		c.show();
*/	
	}

}


class student
{
	student(){
		System.out.println("-----Constructor STUDENT-----");
	}

	void show(){
		System.out.println("====STUDENT====");
	}
	void aaa(){}	// for override
	void bbb(){}	// for override
}

class A extends student
{

	A(){
		System.out.println("-----Constructor A-----");
	}

//	void show(){
//		System.out.println("====STUDENT====A");
//	}
	void aaa(){
		System.out.println("AAA");
	}
}
class A1 extends A
{
}

class B extends student
{
	void show(){
		System.out.println("====STUDENT====B");
	}
	void bbb(){
		System.out.println("BBB");
	}
}

class C extends student
{
	void show(){
		System.out.println("====STUDENT====C");
	}
}


