class ex6
{
	public static void main(String args[])
	{
		student[] s = {
			new student("Jack",93,57),
			new student("Andy",45,65),
			new student("Ethen",25,75),
			new student("May",45,46)
		};

		for(int i=0; i<s.length; i++){
			s[i].show();
		}

	}
	
}

class student
{
	private String name;
	private int chi,eng,sum;
	private double ave;
	
	student(String name, int chi, int eng){
		this.name = name;
		this.chi = chi;
		this.eng = eng;
	}

	void show(){
		sum = chi + eng;
		ave = sum / 2;
		System.out.println("�W"+name+"\t��"+chi+"\t�^"+eng+"\t�`"+sum+"\t��"+ave);

	}
	
}
