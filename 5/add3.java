class add3
{
	public static void main(String args[])
	{
		int[] abc = new int[3];
		double[] def = new double[3];
		boolean[] ghi = new boolean[3];

		System.out.println(abc);
/*
		System.out.println(abc[0]);
		System.out.println(abc[1]);
		System.out.println(abc[2]);
*/	
		for(int i=0;i<3;i++){
			System.out.println(abc[i]);
		}
		for(int i:abc){
			System.out.println(abc[i]);
		}
		for(int i=0;i<3;i++){
			System.out.println(def[i]);
		}
		for(int i=0;i<3;i++){
			System.out.println(ghi[i]);
		}

	
	}
	
}