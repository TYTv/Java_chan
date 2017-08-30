class checkA extends Exception
{
	checkA(String msg){
		System.out.println(msg);
	}
}

class money
{
	private String name;
	private int x;	// performance
	private int m;	// money
	money(String name,int x) throws checkA
	{
	
		if( x >= 0 )
		{
			this.name = name;
			this.x = x;
			if( x >= 500000 ){
				m = (int)(18000 + x * 0.03);
			}else{
				m = 18000;
			}
		}
		else
		{
			throw new checkA("Performance need over 0 !");
		}
	
	}

	void show(){
		System.out.println("NAME:"+name+"\tPERFO:"+x+"\tMONEY:"+m);
	}


	
	void change(int x) throws checkA
	{
		if(x>=0){
		
			
			this.x=x;
			if(x>=500000){
				m=(int)(18000+x*0.03);
			}else{
				m=18000;
			}
		}
		else
		{
			throw new checkA("Change performance need over 0 !");
		}
		
	}


}

class ex5
{
	public static void main(String args[]) throws checkA/*Exception*/
	{

		money m = new money("Jack",25);

		m.show();
		m.change(-63);
		m.show();

	}

}


