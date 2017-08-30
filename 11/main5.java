/*
class bookName
{
	public static final String book1="JAVA";
	public static final String book2="android";
	public static final String book3="WEB";

}
*/

enum bookName			// static
{
	JAVA,android,WEB	// public static final
}

class BOOK
{
	enum bookName	// override
	{
		JAVA,
		$_,
		WEB,
		$341,
		android,
		a56,
		_$
	}
}
class main5
{
	public static void main(String args[])
	{

		//System.out.println(bookName.book1);
		System.out.println(bookName.WEB);

		System.out.println(bookName.values());

		bookName[] x = bookName.values();
		System.out.println(x);
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}

		System.out.println("--------------------------");
		System.out.println(BOOK.bookName.JAVA);
		System.out.println("--------------------------");
		BOOK.bookName[] y = BOOK.bookName.values();
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
		
		
		
	}

}

