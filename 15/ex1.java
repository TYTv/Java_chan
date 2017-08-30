class Book<T,E>	/* Generice */
{
	String bookName;
	T bookprice;
	E xxx;
	
	Book(String bookName, T bookprice, E xxx)
	{
		this.bookName=bookName;
		this.bookprice=bookprice;
		this.xxx=xxx;
	
	}

	void show()
	{
		System.out.println("BOOKNAME:"+bookName+"\tPRICE:"+bookprice);
	}


}

class ex1
{
	public static void main(String args[])
	{
//		Book<Integer,Double> a1=new Book<Integer,Double>("J a v a",650,1.2);
//		Book<Double,Integer> b1=new Book<Double,Integer>("Android",700.,54);
		Book a1=new Book<Integer,Double>("J a v a",650,1.2);
		Book b1=new Book<Double,Integer>("Android",700.,54);
		
		a1.show();
		b1.show();
	
	
	}



}

