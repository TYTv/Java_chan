class ex1
{
	public static void main(String args[])
	{
/*
		int x=0;
		int y=0;
		do
		{

//		for(  ;  ; )
//		{
//			if(	x<10 && y<10 ){
//				;
//			}else{
//				break;
//			}
		
			System.out.println("x("+x+")\ty("+y+")\tHello!");
			x++;
			y+=2;
		}while(x<10 && y<10);
*/

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		//Scanner sc = new Scanner(System.in);
		for( int x=1 ; x<=n ; x++ )
		{
		//	if(x>=101){break;}
		//	if(x==101){continue;}	//101當次不執行
			if(x>=41 && x<=60){continue;}
			if(x>=81 && x<=90){continue;}
			if(x==111){break;}
			System.out.println("x="+x+"\thello , java!");
		
		}


	}
}