class check extends Exception
{
	check(String msg){
		System.out.println("Rang need in "+msg);
	}
}

class ex5
{
	public static void main(String args[]) throws check/*Exception*/
	{
		student2[] s = {
			new student2("Roy",-50,52),
			new student2("Andy",523,52),
		};

		for( int i=0; i<s.length; i++){
			s[i].show();
		}

		try
		{
			System.out.println(
				s[0].sum2(70,-85) +
				s[1].sum2(70,85)
			);
		}
//		catch(Exception eee)
		catch(check eee)
		{
//			System.out.println("0~100");
		}
	}


}

class student2
{
	private String name;
	private int chi;
	private int eng;

	student2(String name, int chi, int eng) {

		if(chi>=0&&chi<=100&&eng>=0&&eng<=100){
			this.name = name;
			this.chi = chi;
			this.eng = eng;	
		}else{
			;
		}
				
	}

	void show(){
		System.out.println("NAME:"+name+"\tCHI:"+chi+"\tENG:"+eng);
	}

	int sum1(int chi, int eng) throws check {	

		if(chi>=0&&chi<=100&&eng>=0&&eng<=100){
			this.chi = chi;
			this.eng = eng;
			return( chi+eng );
		}else{
			throw new check("0~100");
		}

	}

	int sum2(int chi, int eng) throws check {

		if(chi>=0&&chi<=200&&eng>=0&&eng<=200){
			this.chi = chi;
			this.eng = eng;
			return( chi+eng );
		}else{
			throw new check("0~200");
		}

	}


	
}



