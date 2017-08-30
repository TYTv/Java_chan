import java.util.Arrays;
class ex1
{
	public static void main(String args[])
	{
//			int[] chi = new int[5];
//			int chi[] = {1,2,3,4,5};
			int[] chi={100,85,63,74,65};

			System.out.println(chi);
			Arrays.sort(chi);	/* ±Æ§Ç */
			System.out.println( "Size:"+chi.length );
			for( int i=0; i<chi.length; i++)
			{
				
				System.out.println(chi[i]);
			}
			System.out.println(Arrays.binarySearch(chi,74));
			System.out.println(Arrays.binarySearch(chi,66));
	
	
	}


}