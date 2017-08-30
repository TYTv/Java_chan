import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
class ex2
{
	public static void main(String args[])
	{
//		ArrayList<Integer> x = new ArrayList<Integer>();
//		LinkedList<Integer> x = new LinkedList<Integer>();
//		HashSet<Integer> x = new HashSet<Integer>();
		TreeSet<Integer> x = new TreeSet<Integer>();

		System.out.println(x);
		System.out.println(x.iterator());	/* show address */

		x.add(30);
		x.add(20);
		x.add(10);
		x.add(30);
		for( Integer o : x ){
			System.out.println(o);
		}
		
		System.out.println("---------------------------");

		x.add(30);
		x.add(10);
		x.add(20);
		x.add(30);
		for( Integer o : x ){
			System.out.println(o);
		}
		
		
		/*
		int[] x1=new int[3];
		int[] x={10,20,30};
		x[3]=100;
		*/
		
	
	
	}

}

