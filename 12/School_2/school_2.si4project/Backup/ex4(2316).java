
class ex4
{
	public static void main(String args[]) //throws Exception
	{

		student[] s = {
//			new student("Jack",43,45),
			new student(83,-95),
//			new student("May",36,44),
			new student(83,95),
//			new student("Allen",83,95),
		};

		for(int i=0;i<s.length;i++){
			s[i].show();
		}

//		student sss = new student(325,64);
/*
		try
		{
			student s = new student("Jack",300,700);
		}
		catch(Exception eee)
		{
			System.out.println("use theows exception output !!");
		}
*/

	}

}

class student
{
	private String name;
	private int chi;
	private int eng;

	student(String name, int chi, int eng) throws Exception {	// use throws

		if(chi>=0&&chi<=100&&eng>=0&&eng<=100){
			this.name = name;
			this.chi = chi;
			this.eng = eng;	
		}else{
			throw new Exception();
		}
				
	}
	
	student(int chi, int eng){

try
{
		if(chi>=0&&chi<=100&&eng>=0&&eng<=100){
			this.chi = chi;
			this.eng = eng; 
		}else{
			throw new Exception();
		}
}
catch(Exception dd)
{
	System.out.println("try & catch exception output!");
}

	}

	public void show(){
		System.out.println("NAME:"+name+"\tCHI:"+chi+"\tENG:"+eng);
	}

	
}


