import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

class student implements Comparable<student>		/* for TreeSet */
{
	private String name;
	private int chi;
	private int eng;

	student(String name, int chi, int eng){
		this.name = name;
		this.chi = chi;
		this.eng = eng;
	}

	void show(){
		System.out.print("NAME"+name+"\tCHI"+chi+"\tENG"+eng);
	}

	public int compareTo(student o)		/* for TreeSet */
	{
		//return this.chi-o.chi;
		return o.chi-this.chi;
	}

}

class A extends student
{
	private int word;
	A(String name, int chi, int eng, int word){
		super(name,chi,eng);
		this.word = word;
	}
	void show(){
		super.show();
		System.out.println("\tWORD"+word);
	}
}

class B extends student
{
	private int excel;
	B(String name, int chi, int eng, int excel){
		super(name,chi,eng);
		this.excel = excel;
	}
	void show(){
		super.show();
		System.out.println("\tEXCEL"+excel);
	}
}

class ex3
{
	public static void main(String args[])
	{
//		ArrayList<student> s = new ArrayList<student>();
//		LinkedList<student> s = new LinkedList<student>();
//		HashSet<student> s = new HashSet<student>();
		TreeSet<student> s = new TreeSet<student>();

		s.add( new A("Jay",52,35,34) );
		s.add( new B("May",32,57,42) );
		s.add( new A("May",32,98,43) );
		s.add( new B("Sun",55,23,44) );
//		s.add( new student("Tan",85,65));

		for( student out : s ){
			out.show();
		}

		System.out.println("=======================");

		s.add(new B("Tan",85,95,65));
		s.add(new A("Tan",85,95,65));
				
		for( student out : s ){
			out.show();
		}

		Object[] x = s.toArray();
		System.out.println( x[0] );
		((student)x[0]).show();
	
	}

}


