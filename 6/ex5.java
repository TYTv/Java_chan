class ex5
{
	public static void main(String args[])
	{
//		Member m1 = new Member("Jack","taipei","091989");
/*
		Member[] m = new Member[3];
		m[0] = new Member("Jack","taipei","091989");
		m[1] = new Member("May","kaoshiung","09879");
		m[2] = new Member("Andy","sinjue","091534");
*/
		Member 	m[] = {
			new Member("Andy","sinjue","091534"),
			new Member("Amber","taichu","09183274"),
			new Member("Aeon","kaoshiung","09590784")
		};

		for(int i=0; i<m.length; i++){
			m[i].show();
		}
		
	}
}

class Member
{
	String name,add,tel;

	Member(String name,String add,String tel){
		this.name = name;
		this.add = add;
		this.tel = tel;
	}
	
	void show(){
		System.out.println("¦W"+name+"\t¦a"+add+"\t¹q"+tel);
	}
}
