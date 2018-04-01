import java.util.Arrays;
import java.util.Scanner;

public class pct1 {
	
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		String array[] = name.split("\\s+");
		int size = array.length;
		
//		for(int i = 0; i<size;i++)
//			System.out.println(array[i]);
		
		
		if(size == 1)
		{
			System.out.println(name);
		}
		else if(size == 2)
		{
			String Carray[] = array[1].split("\\s*");
			int n = Carray.length;
			if ( Arrays.asList("a","e","i","o","u").contains(Carray[n-1]) )
			{
				System.out.println(array[1] + " " + array[0]);
			}
			else
			{
				System.out.println(array[0]);
			}	
		}
		else if(size == 3)
		{
			System.out.println(array[2] + " " + array[0]);
		}
	}
}
